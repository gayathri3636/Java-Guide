package example;
//Abstract class-- we can declare and define methods
//Interface--we can only declare methods until java 1.7
//But in 1.8 we can define methods in interface using default method
//Even after defing @FunctionalInterface here we wont get any error bcoz we are using default method
@FunctionalInterface
interface demo{
	void acd();
//This below implementation creates compile time error saying we cannot define method in interface
//so to avoid that we create default method
//	public void method() {
//		System.out.println("without default method");
//	}
	default void method() {
		System.out.println("using default method");
	}
}
class exec implements demo{
	public void acd() {
		System.out.println("Implemented acd class");
	}
	public void method() {
		System.out.println("overiding default method");
	}
}
public class defaultmethodininterface {

	public static void main(String[] args) {
		demo obj = new exec();
		obj.acd();//abstract method
		obj.method();//default method
	}

}
