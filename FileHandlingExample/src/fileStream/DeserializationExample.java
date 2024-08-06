package fileStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

public class DeserializationExample {
	
	public static void main(String[] args) {
		try {
//			FileInputStream fs = new FileInputStream("FileStream.txt");
			ObjectInputStream os = new ObjectInputStream(new FileInputStream("FileStream.txt"));
			
			Car c=(Car) os.readObject();
			System.out.println(c.name);
			
			Car c1=(Car) os.readObject();
			System.out.println(c1.name);
			
			
			Car c2=(Car) os.readObject();
			System.out.println(c2.name);
			os.close();
	} 
//			catch (StreamCorruptedException e) {
//            System.err.println("Stream data is corrupted: " + e.getMessage()); }
		catch(EOFException e) {
			System.out.println("Thank You");
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
