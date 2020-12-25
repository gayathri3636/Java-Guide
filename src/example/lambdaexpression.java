package example;
//Refer runnableinterface file and this lambdaexpression file is modification of that using lambda expresiions.
public class lambdaexpression {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for(int i=1; i<=5; i++) {
				System.out.println("Hi");
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
		t1.start();//This start method will call run method
		try {
			Thread.sleep(10);
		}catch(Exception e) {
			System.out.println("error");
		}
		t2.start();
		};
}

