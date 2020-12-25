package example;

class ex{
	public void show() {
		System.out.println("in ex show");
	}
}
//The only purpose of this class here is overiding method in class ex above
//so instead of writing this we can defined anonymous inner class
//class ex1 extends ex{
//	public void show() {
//		System.out.println("in ex1 show");
//	}
//}

public class anonymousinnerclass {

	public static void main(String[] args) {
		//ex obj = new ex1(); //overiding ex method with ex1 method
		//so instead of writing like above we can define anonymous inner class
//Anonymous inner class implementation is like below
		ex obj = new ex()
				{
			public void show() {
				System.out.println("in ex1 show");
			}
		};
		obj.show();
	}

}
