package example;
//same way as method overloading
class cons{
	int numi;
	int numj;
	String op;
	
	public cons() {
		numi=0;
		numj=0;
		op="nothing";
	}
	public cons(int i) {
		numi=i;
		numj=0;
		op="nothing";
		System.out.println(numi+ " "+ numj);
	}
	public cons(int i, int j) {
		numi=i;
		numj=j;
		op="nothing";
	}
	public cons(int i, int j, String k) {
		numi=i;
		numj=j;
		op=k;
	}
}
public class constructoroverloading {
	public static void main(String args[]) {
		cons obj1 = new cons(4);
	}
}
