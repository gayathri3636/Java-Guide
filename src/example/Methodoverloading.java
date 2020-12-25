package example;
//When we have same name with multiple methods and different parameters then it is called method overloading
class casio{
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	public void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}
	public void add(double i, double j) {
		System.out.println(i+j);
	}
}
public class Methodoverloading {
	public static void main(String args[]) {
		casio obj = new casio();
		obj.add(1, 2);
		obj.add(4, 3,5);
		obj.add(4.5, 7.8);
	}

}
