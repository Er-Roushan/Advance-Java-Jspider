package sorting;

import java.util.*;

class Student implements Comparable<Student> {
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
    public String toString(){
		return id + " " + name + " " + age;
    	
    }
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return o.id - this.id;
	}
//  above take Integer age;	
//	public int compareTo(Student o) {
//		return this o.age.compareTo(this.age);
//	}
//	
}
public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1, "Roushan", 24);
		Student s2=new Student(2, "Sonu", 23);
		Student s3=new Student(3, "MC", 25);
		Student s4=new Student(4, "Abhi", 30);
		
		List<Student> l = new ArrayList<Student>();
		l.add(s4);
		l.add(s2);
		l.add(s1);
		l.add(s3);
		
		Collections.sort(l);
		
		for(Object o: l) {
			System.out.println(o);
		}
		
		System.out.println("=============Tree Sort============");
		Set<Student> s = new TreeSet();
		
		s.add(s4);
		s.add(s2);
		s.add(s1);
		s.add(s3);
		
		for(Object o: s) {
			System.out.println(o);
		}
		
//		System.out.print(s1);

	}
}
