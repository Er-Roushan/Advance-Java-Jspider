package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	
	public static void main(String[] args) {
		String path = "page.txt";
		File fobj = new File(path);
		
		try {
			FileReader frdr = new FileReader(fobj);
//			 System.out.println(frdr.read()); //104
//			 System.out.println((char)frdr.read()); //h Downcasting
			int i = frdr.read();
			while(i != -1) {
				System.out.print((char)i);
				i = frdr.read();
			}
			frdr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
