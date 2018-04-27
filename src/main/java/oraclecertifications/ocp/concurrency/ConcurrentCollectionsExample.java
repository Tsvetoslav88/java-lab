package oraclecertifications.ocp.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Concurrency API includes interfaces and classes that help you coordinate
 * access to collections across multiple tasks
 * 
 * 
 * You should use a concurrent collection class anytime that you are going to have multiple
 * threads modify a collections object outside a synchronized block or method, even if you
 * don’t expect a concurrency problem.
 * @author tstsvetk
 *
 */
public class ConcurrentCollectionsExample {

	public static void main(String[] args) {
		try {
			BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
			blockingQueue.offer(39);
			blockingQueue.offer(3, 4, TimeUnit.MILLISECONDS);

			System.out.println(blockingQueue.poll());
			System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
			System.out.println();
		} catch (InterruptedException e) {
			// Handle interruption
		}

		// CopyOnWrite Collections -> These classes copy all of their elements to a new
		// underlying structure anytime an element is
		// added, modifi ed, or removed from the collection.
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
		for (Integer item : list) {
			System.out.print(item + " ");
			list.add(9);
		}
		System.out.println();//4 3 52 
		System.out.println("Size: " + list.size());//Size: 6

	}

}
