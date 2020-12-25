package example;
//wrapper class -- Mechanism to convert primitive to object and object to primitive.
//Automatic conversion of primitive to object is autoboxing and 
//conversion of object to primitve is autounboxing.
//we have 8 wrapper classes
public class wrapperclass {

	public static void main(String[] args) {
		//Boxing
		int a=20;
		Integer i = Integer.valueOf(a); //here converting int to Integer explicitly
		Integer j=a; // Autoboxing--now compiler will write Integer.valueOf(a) internally.
		System.out.println(i +" " + j+" "+a );
		
		//Unboxing
		//Integer v = new Integer(3) is deprectaed.
		Integer v = 3;
		int s = v.intValue();//explicit conversion to primitive from object.
		int d = v;//unboxing
		System.out.println(v+" "+s+" "+d);
		
		//parseInt
		String str = "123";
		int n =Integer.parseInt(str);
		System.out.println(n);
	}

}
