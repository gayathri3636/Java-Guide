package example;
//using runnable interface not threads
class hii implements Runnable{
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
class helloo implements Runnable{
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
public class RunnableInterface {

	public static void main(String[] args) {
		Runnable obj1=new hii();
		Runnable obj2 = new helloo();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();//This start method will call run method
		try {
			Thread.sleep(10);
		}catch(Exception e) {
			System.out.println("error");
		}
		t2.start();
	}

}
