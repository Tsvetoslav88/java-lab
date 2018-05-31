package oraclecertifications.ocp.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamDataCalculator {

	public int processRecord(int input) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// Handle interrupted exception
		}

		return input;
	}

	public void processAllData(List<Integer> data) {
		// data.stream().map(a -> processRecord(a)).count();/*Tasks completed
		// in: 40.329 seconds*/
		data.parallelStream().map(a -> processRecord(a))
		        .count();/* Tasks completed in: 10.329 seconds */
	}

	public static void main(String[] args) {
		ParallelStreamDataCalculator calculator = new ParallelStreamDataCalculator();

		// Define the data
		List<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < 4000; i++)
			data.add(i);

		// Process the data
		long start = System.currentTimeMillis();
		calculator.processAllData(data);
		double time = (System.currentTimeMillis() - start) / 1000.0;

		// Report results
		System.out.println("\nTasks completed in: " + time + " seconds");

	}
}
