
public class Person {
	
	private String fname;
	private String lname;
	private char gender;
		
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	
	public Person() {
		
	}
	
	public Person(String f, String l, char g) {
		this.fname = f;
		this.lname = l;
		this.gender =g;
		
	}
	
	
	
}
