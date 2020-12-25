package example;

class A{
	public A() {
		System.out.println("in A");
	}
	public A(int i) {
		System.out.println("in A int parameterised");
	}
}

class B extends A{
	public B() {
		super(); //By default subclass has supermethod which calls A constructor
		System.out.println("in B");
	}
	public B(int i) {
		super(i); //By specifying i here it calls parameterised constructor in parent class
		System.out.println("in B int parameterised");
	}
}

public class supermethod {

	public static void main(String[] args) {
		B ovh = new B(5); //Here we are calling parameterised in B and by default subclass has super method
	  //B ovh = new B(); //here only super constructor and b constructor are called but not parameterised ones
	}

}
