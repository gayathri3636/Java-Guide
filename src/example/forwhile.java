package example;

public class forwhile {
	public static void main(String args[]) {
		//While loop
		int i=1; //initialization
		while(i<=5) { //condition
			System.out.println("Hello world");
			i++; //increment
		}
		
		//do-while
		//where you will execute loop atleast once and the condition is checked later
		int k=9;
		do {
			System.out.println("world");
			k++;
		}
		while(k<=5);

	
	//for loop--when you know starting and ending point go to for loop
	for(int h=1; h<=5; h++) {
		System.out.println(h);
	}

}
}