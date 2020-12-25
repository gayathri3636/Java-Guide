package example;
interface demo1{
	void abc();
	default void show() {
		System.out.println("In demo1 show");
	}
}
interface demo2{
	default void show() {
		System.out.println("In demo2 show");
	}
} 
//so here it implemnets demo1 and demo2 
class DemoImp implements demo1, demo2{
	public void abc() {
		System.out.println("in abc method");
	}
	//By ddefining show() method here we can remove the ambiguity issue like which show method to call
	//either from demo1 or demo2. so to avoid that ambiguity we create show() method in DemoImp.
//	public void show() {
//		System.out.println("In DemoImp show");
//	}
//or we can use overide method like below
	@Override
	public void show() {
		// TODO Auto-generated method stub
		demo1.super.show();//In demo1 show
	  demo2.super.show(); //In demo2 show
	}
}
public class Mulinheritanceissuewithinterface {
	public static void main(String args[]) {
		demo1 obj = new DemoImp();
		obj.show(); //In DemoImp show
	}
}
