package com.example.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.DatatypeConverter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImageUpload {

	private static String UPLOADED_FOLDER = "D://uploadFile//";

	@GetMapping("home")
	public String homePage() {
		return "home";
	}

	@PostMapping("/upload")
	public String uploadImage(@RequestParam("file") MultipartFile file, HttpServletRequest req) {
		Path pt = null;
		String rootDirectory = req.getSession().getServletContext().getRealPath("/");
		System.out.println("rootDirectory " + rootDirectory);

		pt = Paths.get(rootDirectory + "WEB-INF//images//logo.jpg");
		// System.out.println("path = " + pt.getFileName());
		File f2 = pt.getFileName().toFile();

		try {
			byte[] bytes = file.getBytes();
			Long l = new Date().getTime();
			String s = l.toString();
			String ss = s + file.getOriginalFilename();
			System.out.println(ss);
			Path path = Paths.get(UPLOADED_FOLDER + ss);
			Files.write(path, bytes);
			req.setAttribute("message", "You successfully uploaded '" + file.getOriginalFilename() + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	private static final File dir = new File(UPLOADED_FOLDER);
	private static final String[] EXTENSIONS = new String[] { "jpeg", "png", "bmp", "jpg" };

	private static FilenameFilter ImageFiter = new FilenameFilter() {

		@Override
		public boolean accept(File dir, String name) {
			try {
				for (final String ext : EXTENSIONS) {
					if (name.endsWith("." + ext)) {
						return (true);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return (false);
		}
	};

	@GetMapping("viewimage")
	public String viewImage(HttpServletRequest req) {
		System.out.println("viewImage      :    "+dir.listFiles(ImageFiter).length);
		try {
			ArrayList<String> listImage=new ArrayList<>();
			if (dir.isDirectory()) {
				int i=0;
				for (final File f : dir.listFiles(ImageFiter)) {
					BufferedImage img = null;
					try {
						img = ImageIO.read(f);
						ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
						ImageIO.write(img, "jpg", byteArrayOutputStream);
						byteArrayOutputStream.flush();
						byte[] byteArr=byteArrayOutputStream.toByteArray();
						byteArrayOutputStream.close();
						String b64=	DatatypeConverter.printBase64Binary(byteArr);
						System.out.println("b64           "+b64);
						listImage.add(b64);
						//System.out.println("img.getHeight()   "+img.getHeight());
						//System.out.println(f.getName()+"             size     "+f.length());
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			} else {
				System.out.println("not directory");
			}
			req.setAttribute("imagePhoto",listImage);
		//	System.out.println(listImage);
			//listImage.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "viewimage";
	}

}
