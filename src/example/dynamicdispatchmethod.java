//Dynamic method dispatch or run time polymorphism -- in which call to an overidden 
//method is resolved at run time rather than compile time.
//To achieve dynamic method dispatch we have to follow runtime polymorphism
package example;
class A3{
	public void show() {
		System.out.println("in A");
	}
}
class B3 extends A3{
	public void show() {
		System.out.println("in B");
	} 
	public void config() {
		System.out.println("in config");
	}
}
class C3 extends A3{
	public void show() {
		System.out.println("in c");
	}
}
public class dynamicdispatchmethod {

	public static void main(String[] args) {
		//upcasting--Here A3 is reference and B3 is implementation so method of B3 is called.
		//so when we do upcasting we can only call those methods which are in reference variable of parent class.
		//This is called as runtime polymorphism because we are assigning this at runtime.
		A3 obj1  = new B3(); //This is called as upcasting means reference variable of parent class refers to object of child class.
		obj1.show();
		//obj1.config(); This cannot be done because A3 doesnt have config method only B3 has. so we cannot call this method.
		obj1 = new C3();
		//And we are changing method here everytime we assign different object hence it is called dynamic method dispatching.
		obj1.show(); //here this will call method in c3 because we assigned object of c3
	}

}
