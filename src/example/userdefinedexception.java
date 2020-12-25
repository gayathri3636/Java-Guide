package example;

public class userdefinedexception {

	public static void main(String[] args) {
		int i,j;
		i=8; j=9;
		try {
			int k = i/j;
			if(k==0) {
				//This is custom exception. Look out for ZeroException.java file
				throw new ZeroException();
			}
			System.out.println(k);
		}
		catch(ZeroException e){
			System.out.println("Error in zero");
		}
	}

}
