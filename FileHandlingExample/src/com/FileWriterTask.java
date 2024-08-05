package com;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterTask {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your name: ");
//		obj.nextLine();
		String name = obj.nextLine();
		String path = "fol/text.txt";
//		File fobj = new File(path);
		
		try {
			FileWriter fw = new FileWriter(path);
			fw.write(name);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		obj.close();
	}

}
