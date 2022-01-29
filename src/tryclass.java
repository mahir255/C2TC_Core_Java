import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
public class tryclass {
	public static void main(String[] args) {
		ReentrantLock r=new ReentrantLock();
		r.lock();
		
		r.unlock();
		System.out.println(r.isLocked());
		r.lock();
		r.lock();
		r.lock();
		r.lock();
		r.lock();
		r.lock();
		
		System.out.println(r.isHeldByCurrentThread());
		
	}
}
