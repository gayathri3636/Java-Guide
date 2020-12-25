package example;
//we dont need objects to call static methods in java
//If you create variable inside interface it becomes final you cannot change value
interface unit{
	int i=8;
	void abc();
	static void cube() {
		System.out.println("In cube static method");
	}
}
class demoabc implements unit{
	public void abc() {
		//i=9; so here this is error because cannot assign to final variable which is defined in interface
		System.out.println("abc method");
	}
}
public class staticmethodininterface {

	public static void main(String[] args) {
		unit.cube();//we dont have to define object to call static method
	}

}
