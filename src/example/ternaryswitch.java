package example;

public class ternaryswitch {
	public static void main(String args[]) {
		//Ternary operator?true:false(Ternary or conditional operator syntax)
		int i=7;
		int j=8;
		j=i>3?1:2;
		System.out.println(j);
		
		//switch
		//string in can be used in 1.7 version and later
		String n = "abc";
		switch(n) {
		case "abc":
			System.out.println(" switch to 1");
			break;
		case "pqr":
			System.out.println(" switch to 2");
			break;
		default:
			System.out.println("No match");
		}
	}

}
