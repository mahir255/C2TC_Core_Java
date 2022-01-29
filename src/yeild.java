class MyThreads extends Thread
{
public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			
		}
	}
}

public class yeild {

	public static void main(String[] args) throws InterruptedException{
		MyThreads m=new MyThreads();
		m.start();
		m.join();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
