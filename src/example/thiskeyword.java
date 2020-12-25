package example;
//This refers current object
class calc1{
	int num1;
	int num2;
	int result;
	public calc1(int num1, int num2) {
		this.num1=num1; //represents current class instance variable
		this.num2=num2;
	}
}
public class thiskeyword {
	public static void main(String args[]) {
		calc1 obj = new calc1(5,9);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}
}
