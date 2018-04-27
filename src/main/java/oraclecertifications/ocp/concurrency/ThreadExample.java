package oraclecertifications.ocp.concurrency;

import java.util.stream.Stream;

class PrintData implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println("Printing record: " + i);
	}

}

public class ThreadExample {

	public static void main(String[] args) {
		(new Thread(new PrintData())).start();
		(new ReadInventoryThread()).start();
	}

}

//less common practice of extending the Thread class and overriding the run() method
class ReadInventoryThread extends Thread {
	public void run() {
		System.out.println("Printing zoo inventory");
	}
}