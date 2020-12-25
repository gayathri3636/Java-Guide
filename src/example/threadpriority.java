package example;
//Refer runnableinterface file and this lambdaexpression file is modification of that using lambda expresiions.
//used join method
//Thread priority
public class threadpriority {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {
			for(int i=1; i<=5; i++) {
				System.out.println("Hi "+Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					System.out.println("error");
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i=1; i<=5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					System.out.println("error");
				}
			}
		});
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.setName("First thread");
		t2.setName("second thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();//This start method will call run method
		try {
			Thread.sleep(10);
		}catch(Exception e) {
			System.out.println("error");
		}
		System.out.println(t1.isAlive());//returns boolean whether in running state or not
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());//These are executed by main thread
		System.out.println("print after executing t1 and t2");//executed by main thread
		};
}

