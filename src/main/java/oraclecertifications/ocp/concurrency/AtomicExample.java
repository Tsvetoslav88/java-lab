package oraclecertifications.ocp.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
	private int sheepCount = 0;

	private AtomicInteger sheepCountAtomic = new AtomicInteger(0);

	private void incrementAndReportAtomic() {
		System.out.print(sheepCountAtomic.incrementAndGet() + " ");
	}

	private void incrementAndReport() {
		System.out.print((++sheepCount) + " ");
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			AtomicExample manager = new AtomicExample();
//			for (int i = 0; i < 10; i++) //1 2 2 3 4 5 6 7 8 9
//				service.submit(() -> manager.incrementAndReport()); //Here we can have duplicate values because more then one thread can update the same resource
			for (int i = 0; i < 10; i++) //1 4 3 2 5 6 7 8 9 10
				service.submit(() -> manager.incrementAndReportAtomic()); //Here we made the private parameter atomic which mean that only single thread can update the value 
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
