package example;
//static keyword in java is used for memory management. 
//static variable is used to refer common property of all objects.
//For example company name will be same for all the employees and college name will be same for all students in a college
//Advantages are makes your program memory efficient.
//static variables are same for all objects
//Non static variables are different for all objects
//cannot use non static variables in static block

class Emp{
	int eid;
	String ename;
	static String companyName="Apple";//By doing this as static we dont have to define everytime so we can save memory
	
	public Emp(int id, String n) {
		eid=id;
		ename=n;
	}
	void display() {
		System.out.println(eid+ " " + ename + " "+ companyName);
	}
}
public class statickeyword {
	public static void main(String args[]) {
		Emp e1 = new Emp(111,"rahul");
		Emp e2 = new Emp(123, "naveen");
		e1.display();
		e2.display();
	}
}
