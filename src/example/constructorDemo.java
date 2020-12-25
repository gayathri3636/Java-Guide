package example;
//It is called contructor because it constructs value at time of object creation.It is not necessary to write constructor
//for a class bcoz java compiler creates default constructor if your class doesnt have any.
//It is a member method
//same name as classname
//It will never return anything
//It will be used to allocate memory
//java constructor cannot be abstract, static, final and synchronized
//whenever we create an object constructor will be called automatically
class teacher{
	int id;
	String name;
	//we can have multiple constructors but make sure they have different signatures ie, different parameters
	public teacher(int i, String n){
		id=i;
		name=n;
		//First constructor is called and then value of id and name are displayed
		System.out.println("constructor called");
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class constructorDemo {
//two types of constructor one is defult other is parameterized
	
	//Default constructor
	public static void main(String args[]) {
//	teacher t1 = new teacher(); //default constructor
		teacher t1=new teacher(111, "gayathri");
	t1.display();
	
	
}
}