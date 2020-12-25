package example;
class hi extends Thread{
	public void run() { //run is internal method of thread
		for(int i=1; i<=5; i++) {
		System.out.println("Hi");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("error");
		}
		}
	}
}
class hello extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
		System.out.println("Hello");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("error");
		}
		}
	}
}
public class Threaddemo {

	public static void main(String[] args) {
		hi obj1=new hi();
		hello obj2 = new hello();
		obj1.start();//This start method will call run method
		try {
			Thread.sleep(10);
		}catch(Exception e) {
			System.out.println("error");
		}
		obj2.start();
//		obj1.show();
//		obj2.show();
	}

}
