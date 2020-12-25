package example;

class vararguments{
	// ...n ----variable length argumnets
	public int add(int ...n) { //Here n is array we can pass many many arguments
		int sum = 0;
		for(int i:n) {
			sum+=i;
		}
		return sum;
	}
}

public class varargs {

	public static void main(String[] args) {
		vararguments obj = new vararguments();
		System.out.println(obj.add(2,3,5,6,7,879699,3));
	}

}
