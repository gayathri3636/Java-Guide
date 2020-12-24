package example;

public class operators {
	/*
	 * 
	 * Arithmetic-- +, -, *, /, %
	 * Bitwise
	 * Logical
	 * Relational
	 * 
	 * */
	public static void main(String args[]) {
	
	int i=3, l=2;
	int r1=i+l;
	int r2=i-l;
	int r3=i*l;
	double r4=(double)i/l; //Explicit casting
	int r5=i%l; //remainder
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	System.out.println(r5);
	
	//pre-increment-- ++n
	//post increment-- n++
	
	int m=9;
	int n=7;
	int pre=++n;
	int post=n++;
	System.out.println(m);
	System.out.println(n);
	System.out.println(pre);
	System.out.println(post);
	}
}
