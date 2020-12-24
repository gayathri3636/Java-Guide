package example;

public class variables {
	public static void main(String args[]) {
	System.out.println("Hello world");
	int a=5; //integer
	float f = 5.5f;
	double d = 7.8;
	long l= 9l;
	char c='A';
	System.out.println(a);
	System.out.println(f);
	System.out.println(d);
	System.out.println(l);
	System.out.println(c);
	
	//type casting
	//Implicit or widening casting
	double k=9;
	System.out.println(k);
	
	//Explicit casting or narrowing casting
	int t = (int)4.8;
	System.out.println(t);
}
}