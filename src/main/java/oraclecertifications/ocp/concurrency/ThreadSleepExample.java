package oraclecertifications.ocp.concurrency;

public class ThreadSleepExample {
	
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		new Thread(() -> {for(int i=0; i<500; i++) ThreadSleepExample.counter++;}).start();
		
		while(ThreadSleepExample.counter<100) {
			System.out.println("Not reached yet");
			Thread.sleep(1000);
		}
		System.out.println("Reached!");

	}

}
