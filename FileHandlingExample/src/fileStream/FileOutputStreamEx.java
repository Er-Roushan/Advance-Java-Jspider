package fileStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car implements Serializable{
	int srno;
	String name;
	public Car(int srno, String name){
		this.srno= srno;
		this.name=name;
	}
	
}
public class FileOutputStreamEx {

	public static void main(String[] args) {
	
		Car c = new Car(1, "tata");
		Car c1 = new Car(2, "suv");
		Car c2 = new Car(3, "bmw");
		
		try {
			FileOutputStream fobj = new FileOutputStream("FileStream.txt", true);
			ObjectOutputStream os = new ObjectOutputStream(fobj);
			os.writeObject(c);
			os.writeObject(c1);
			os.writeObject(c2);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
