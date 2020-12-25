package example;

public class breakcontinue {
	public static void main(String args[]) {
		//Break
		for(int i=0; i<=10; i++) {
			if(i==7) {
				break;
			}
		System.out.println("value of i is" + i);
		}
		System.out.println("*********************************");
		//Continue
		for(int j=0; j<=10; j++) {
			if(j==7) {
				continue;
			}
		System.out.println("value of j is" + j);
		}
	}
}
