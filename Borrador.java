
import java.util.Scanner;

public class Borrador {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person("Roberto", "Diaz",'M');
		Student s1 = new Student();
		Student s2 = new Student ("John","Perez", 'M',"Freshmen");
		
		System.out.println(p1.getFname());
		System.out.println(p2.getFname());
		System.out.println(s1.getFname());
		System.out.println(s2.getFname());
	}
	
}
