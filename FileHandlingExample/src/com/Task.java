package com;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Task {

	public static void main(String[] args) {
		int sum=0;
		
		String path = "task.txt";
		File f = new File(path);
		
		try {
			FileReader fr = new FileReader(f);
			int i = fr.read();
			while(i != -1) {
				System.out.print((char)i);
				int num = i - '0';
				
				if(i >= 48 && i<=57) {
					sum += num;
					
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
		System.out.print(" = " + sum);
	}

}
