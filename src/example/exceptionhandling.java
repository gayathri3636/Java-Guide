package example;

public class exceptionhandling {

	public static void main(String[] args) {
		try {
			int i =12;
			int j=0;
			int k=i/j;
			System.out.println(k);
		}
		catch(Exception e) {
			System.out.println("rest of code after handling exception");
		}
		//executed always with or without exception.
		finally {
		System.out.println("bye");
		}
	}

}
