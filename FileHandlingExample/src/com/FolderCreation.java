package com;
import java.io.File;
public class FolderCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fol1 = "Folder1";
		String fol2 = "Folder2";
		String fol3 = "Folder3";
		
		File f = new File(fol1);
		f.mkdir();
		
		File f2 = new File(fol2);
		f2.mkdir();
		
		File f3 = new File(fol3);
		f3.mkdir();
		
		
	}

}
