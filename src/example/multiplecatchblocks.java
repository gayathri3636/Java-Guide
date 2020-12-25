package example;

public class multiplecatchblocks {

	public static void main(String[] args) {
		try {
			int a[]=new int[6];
			a[6]=9;
			int i =12;
			int j=10;
			int k=i/j;
			System.out.println(k);
		}
		catch(ArithmeticException e) {
			System.out.println("rest of code after handling exception");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("array index outofbound");
		}	
		//executed always with or without exception.
		finally {
		System.out.println("bye");
		}
	}
}
