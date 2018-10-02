package com.kk.translator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReadingApps {
	public static void main(String[] args) throws IOException {
		FileReadingApps readingApps = new FileReadingApps();
		readingApps.readFile();
	}

	private void readFile() throws IOException {
		File file = new File("D:\\abc.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			//System.out.println(st);
			Translator http = new Translator();
			try {
				String word = http.callUrlAndParseResult("en", "hi", st);
				System.out.println(word);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
