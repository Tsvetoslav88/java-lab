package oraclecertifications.ocp.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample {
	private int sheepCount = 0;
	
	private synchronized void incrementAndReport() {
		System.out.print((++sheepCount)+" ");
		}
	//We can use synchronized block instead of synchronized word in the method definition, which is the same 
//	private void incrementAndReport() {
//		synchronized (this) {
//			System.out.println((++sheepCount)+" ");
//		}
//	}
	
	private void mai() {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			
			SynchronizedExample manager = new SynchronizedExample();
			for(int i=0; i<10; i++) {//1 2 3 5 4 6 7 8 9 10 
				service.submit(()->manager.incrementAndReport());//When one thread access the resource, other are waiting till the previous has finished
			}
		} finally {
			
		}
	}
}
