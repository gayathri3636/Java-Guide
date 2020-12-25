package example;
//Types of interface
//1. Normal interface
//2.single abstract method(SAM interface)-- only one abstract method. This is also known as Functional interface
//If we know functional interface we can implement lambdaexpression which came from scala
//marker interface--which does not have any methods like serializable
//@FunctionalInterface--By this we can have only abstract method
//Lambda expressions--short block of code which takes in parameters and returns value.
//similar to methods but they dont need a name and can be implemented right in body of method. 
interface a{
	void show();
//	void int(); Not supported in functional interface
}
public class functionalinterface {

	public static void main(String[] args) {
		//Lambda expression
		//syntax--parameter->expression or
		//(parameter1, parameter2) -> expression
		//If lambda expression needs to return value then code block should have return statement
		a obj = () -> System.out.println("I am the best");
		obj.show();
	}

}
