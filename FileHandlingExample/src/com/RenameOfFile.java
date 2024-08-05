package com;

import java.io.File;

public class RenameOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="fol/a.txt";
		File fp = new File(path);
		
		//to rename a.txt
		fp.renameTo(new File("page.txt"));
		//to delete a file
		  //fp.delete();
	}

}
