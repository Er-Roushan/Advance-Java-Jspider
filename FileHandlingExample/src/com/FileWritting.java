package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
			String path = "page.txt";
			File f = new File(path);
			
			try {
				FileWriter fw = new  FileWriter(f); //here we pass 'true'along with file obj as another arg for concatination  else it override file each time
				fw.write("hello World");
				fw.flush();
				fw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}

		

	}

}
