//Multiple inheritance is not supported in java because to avoid ambiguity
//when c class inherits A and B and if A and B have same methods then there will
//be ambiguity to call method from A or b class.
//since compile time errors are better than runtime errors, java issues compil time error
//eventhough you have same or different methods. so multiple inheritance is not supported in java.
//class A{  
//void msg(){System.out.println("Hello");}  
//}  
//class B{  
//void msg(){System.out.println("Welcome");}  
//}  
//class C extends A,B{//suppose if it were  
//   
// public static void main(String args[]){  
//   C obj=new C();  
//   obj.msg();//Now which msg() method would be invoked?  
//}  
//}  
package example;
//IS-A -- parent child relation
//HAS-A -- Aggregation respresents has-a relation
class calculator{ //super class or parent or base class
	public int add(int i, int j) {
		return i+j;
	}
}
//subclass inherits properties from superclass
class advCalc extends calculator{ //subclass or child or derived class
	public int sub(int i, int j) {
		return i-j;
	}
}

//Multi level inheritance--here it has add, sub, mul all three operations
class veryadvcalc extends advCalc{
	public int mul(int i, int j) {
		return i*j;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		veryadvcalc ojn = new veryadvcalc();
		int result1 = ojn.add(3, 4);
		int result2 = ojn.sub(8, 3);
		int result3 = ojn.mul(2, 4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
