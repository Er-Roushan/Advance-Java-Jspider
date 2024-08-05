package com;
import java.io.File;
import java.io.IOException;
public class FileExampleTwo {

	public static void main(String[] args) {

//		String dir = "fol";  for one time		
//		File f = new File(dir); for one time
//		f.mkdir();  for one time to create folder first
		
		String path="fol/a.txt";
		File fp = new File(path);
		
		if(!(fp.exists())) {
			try {
				fp.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
