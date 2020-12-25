package example;

class At{
	public At() {
		System.out.println("in A");
	}
	public At(int i) {
		System.out.println("in A int parameterised");
	}
}

class Bt extends At{
	public Bt() {
		super(); //By default subclass has supermethod which calls A constructor
		System.out.println("in B");
	}
	public Bt(int i) {
		super(i); //By specifying i here it calls parameterised constructor in parent class
		System.out.println("in B int parameterised");
	}
}

public class supermethod {

	public static void main(String[] args) {
		Bt ovh = new Bt(5); //Here we are calling parameterised in B and by default subclass has super method
	  //B ovh = new B(); //here only super constructor and b constructor are called but not parameterised ones
		
	}

}
