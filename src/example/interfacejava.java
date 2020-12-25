package example;
//Interface--used to achieve abstraction.
//There can only be abstract methods in java interface but not method body
//used to achieve abstraction and multiple inheritance in java which is not possible normally
//Interface is declared using interface keyword.
//Multiple inheritance in java is not supported by class but possible by interface
//A class that implements interface must implement all methods declared in interface.
interface writer{
	void write();
}
interface readable{
	void read();
}
//so here we implemented interface so we have to perform write method otherwise it is compile time error.
class pen implements writer{
	public void write() {
		System.out.println("i am pen");
	}
}
//so here we implemented interface so we have to perform write method otherwise it is compile time error.
class pencil implements writer{
	public void write() {
		System.out.println("I am pencil");
	}
}
class kit{
	public void dosomething(writer p) {
		p.write();
	}
}

//******************************--Multiple inheritance in java is not supported by class but possible by interface
class multipleinheritanceininterface implements writer, readable{
	public void write() {
		System.out.println("In write");
	}
	public void read() {
		System.out.println("In read");
	}
}


//*******************************Interface extends another interface
interface Printable{  
void print();  
}  
interface Showable extends Printable{  
void show();  
}  
class TestInterface4 implements Showable {  
	public void print(){
		System.out.println("Hello----from interface extending interface");
		}  
	public void show(){
		System.out.println("Welcome----from interface extending interface");
		} 
}

//***************************************
public class interfacejava {

	public static void main(String[] args) {
		writer p = new pen();
		writer pc = new pencil();
		kit k = new kit();
		multipleinheritanceininterface mul = new multipleinheritanceininterface();
		TestInterface4 test = new TestInterface4();
		test.print();
		test.show();
		mul.write();
		mul.read();
		k.dosomething(pc);
		p.write();
		pc.write();
		}

}
