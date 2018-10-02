package com.example.demo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class TestApps {
	private static File dir = new File("D://uploadFile//");
	private static String[] EXTENSIONS = new String[] { "jpg", "jpeg", "png", "bmp" };
	private static FilenameFilter filenameFilter=new FilenameFilter(){@Override public boolean accept(File file,String name){for(final String ext:EXTENSIONS){if(name.endsWith("."+ext)){return true;}}return false;}};

	private static final File newDir = new File("D://kaushal//");

	public static void getImage() throws IOException {
		if (dir.isDirectory()) {
			for (final File file : dir.listFiles(filenameFilter)) {
				System.out.println("=========" + file.getName());
				BufferedImage img=null;
			if(newDir.isDirectory()) {
				Path path=Paths.get(newDir.getPath(), file.getName());
				img=ImageIO.read(file);
				ByteArrayOutputStream arrayOutputStream=new ByteArrayOutputStream();
				ImageIO.write(img, "jpg", arrayOutputStream);
				arrayOutputStream.flush();
				
				Files.write(path, arrayOutputStream.toByteArray());
				arrayOutputStream.close();
			}else {
				newDir.mkdirs();
			}
		}
		}
	}

	public static void main(String[] args) throws IOException {
		TestApps.getImage();
	}
}
