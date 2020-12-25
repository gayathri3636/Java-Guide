package example;
//Anonymous class with interface
interface abc{
	void show();
}
//so we can define anonymous class below so we can avoid below code
//class implementor implements abc{
//	public void show() {
//		System.out.println("anything");
//	}
//}
public class anonymousclasswithinterface {

	public static void main(String[] args) {
		abc obj = new abc() {
			public void show() {
				System.out.println("anything");
			}
		};
		obj.show();
	}

}
