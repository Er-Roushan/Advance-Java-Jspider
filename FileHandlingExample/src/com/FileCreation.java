package com;
import java.io.File;
import java.io.IOException;
public class FileCreation {

	public static void main(String[] args) {
		String path = "folder1/roushan.txt";
		File f = new File(path);
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
