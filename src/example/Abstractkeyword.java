package example;
//A class which is declared with abstract keyword is known as abstract class 
//process of hiding implementation details and showing only functionality to user
//It only shows essential things and hides internal details.
//For example sending sms where you type sms and send but you dont know anything about message delivery.
//It lets you focus on what it does instead of how it does.
//abstract class must be declared with abstract keyword and can have abstarct and non abstract methods.
//cannot be instantiated
//here human class is abstract class
abstract class Human{
	//To define abstarct method we must have abstract class.
	public abstract void eat();//Abstract methods doesnt specify body
	public void walk() { //Non abstract method
		
	}
}
//here Man class is concrete class.
class Man extends Human{
	//here it is mandatory to implement inherited abstract method which is eat method
	public void eat() {
		System.out.println("in eat from Man class");
	}
}
public class Abstractkeyword {

	public static void main(String[] args) {
		//cannot be instantiated like below
		//Human obj = new Human();
		//so we can call eat method as below
		Human obj = new Man();
		obj.eat();
	}

}
