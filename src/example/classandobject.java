package example;

//First we have to define class and class takes variables id and name and methods like perform and to access these variables and methods we need objects
class Student{ // class student
	int id=2;
	String name="gayathri";
}

class calc{  // class calc
	int num1=2;
	int num2=8;
	int result;
	
	public void perform() {
		result = num1+num2;
	}
}

public class classandobject {
	//when we want to create object for a particular class we need main. The execution starts from main method
	//To call any method we require an object and execution starts from main. so we represent this as static means we dont require an object to call main.
	public static void main(String args[]) {
		Student s1 = new Student(); // creating student object
		System.out.println(s1.id);
		System.out.println(s1.name);
		calc obj = new calc(); //creating calc object
		obj.perform();
		System.out.println(obj.result);
	}
}
