package com;
import java.io.File;
public class FileExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\HP\\Pictures\\HP Palette Sample Photos\\SamplePhoto_4.jpg";
		
		File fl = new File(path);
		System.out.println(fl.exists());
		

	}

}
