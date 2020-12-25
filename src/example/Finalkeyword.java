package example;
//Final keyword can be used with variables, methods and classes
//final class----By this we cannot change variable value it will be constant
//final Method--if you make method as final you cannot overide it
//final class-- if you make class as final, you cannot extend it
//****************************Final variable
class finalvariable{
	final int i=0;
	//here it is called or blank or uninitialised final variable.
	//final int i;
	public finalvariable() {
		//By making it as final we cannot change i value here
		//Blank final variable can be initialized in constructor only
		//i=10;
	}
}
//******************************Final variable

//*******************************Final method
//final Method--if you make method as final you cannot overide it
class finalmethod{
//	void run() {
//		System.out.println("running in final method");
//	}
	//To avoid overiding we add final
	final void run() {
		System.out.println("running in final method");
	}
}
class finalmethod2 extends finalmethod{
	//we cannot declare this method becuase run method is final in parent class
//	void run() {
//		System.out.println("running not in final method");
//	}
}
//*******************************Final method

//*******************************Final class
//so this will create compile time error because we cannot extend class when you make it as final
//final class Bike{}  
//
//class Honda1 extends Bike{  
//  void run(){System.out.println("running safely with 100kmph");}  
//    
//  public static void main(String args[]){  
//  Honda1 honda= new Honda1();  
//  honda.run();  
//  }  
//}  
//********************************Final class

//**********************Final method is inherited but u cannot overide it
class Bike1{  
	  final void run(){System.out.println("running...");}  
	}  
	class Honda2 extends Bike1{  
	   public static void main(String args[]){  
	    new Honda2().run();  
	   }  
	} 
//********************************output is running
	
//********************************static blank final variable declared can be initialised only in static block
//class A1{  
//	static final int data;//static blank final variable  
//	static{ data=50;}  
//	public static void main(String args[]){  
//	System.out.println(A1.data);  
//	}  
//} 
//******************************************************
	
//*****************************************If any parameter declared as final you cannot change it
//	class Bike11{  
//		  int cube(final int n){  
//		   n=n+2;//can't be changed as n is final  
//		   n*n*n;  
//		  }  
//		  public static void main(String args[]){  
//		    Bike11 b=new Bike11();  
//		    b.cube(5);  
//		 }  
//		} 
	public class Finalkeyword {

	public static void main(String[] args) {
		finalvariable obj = new finalvariable();
		finalmethod2 obj1 = new finalmethod2();
		System.out.println(obj.i);
		obj1.run(); //so here finalmethod2 is overiding finalmethod.so to avoid this we make parent class as final
	}

}
