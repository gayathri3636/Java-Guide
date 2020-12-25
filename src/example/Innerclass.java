package example;
//Inner class is class which is declared inside another class
//Two types--- member class and static class
class outer{
	public void show() {
		System.out.println("in show outer class");
	}
	//member class
//	class Inner{
//		public void display() {
//			System.out.println("in display inner class");
//		}
//	}
	//static class
	static class Inner {
		public void display() {
			System.out.println("In display using static class");
		}
	}
}

public class Innerclass {
	
	public static void main(String[] args) {
		outer obje = new outer();
		obje.show();
		//To access display method which is inside outer class we have to access in below way
		//Member class will be called in below way
//		outer.Inner obje2 = obje.new Inner();
		//static class object
		//In static class we dont need object to call static class
		outer.Inner obje2 = new outer.Inner();
		obje2.display();
	}

}
