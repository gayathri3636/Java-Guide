package example;
//Method overiding-- child class method will overide parent class method

class A1{
	public void show() {
		System.out.println("in A");
	}
}

class B1{

	public void show() {
		System.out.println("in B");
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.show(); //in B so B(child) overrides A(parent)--Method overiding
	}

}
