package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
	public static void main(String[] args) {
		int mul=1;
		
		String path = "task2.txt";
		File f = new File(path);
		
		try {
			FileReader fr = new FileReader(f);
			int i = fr.read();
			while(i != -1) {
				System.out.print((char)i);
				int num = i - '0';
				
				if(i >= 48 && i<=57) {
					mul *= num;
					
				}
				i=fr.read();
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(" = " + mul);
	}

}
