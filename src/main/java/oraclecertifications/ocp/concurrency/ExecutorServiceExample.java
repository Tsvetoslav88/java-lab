package oraclecertifications.ocp.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * You first obtain an instance of an ExecutorService interface, and then you send the service tasks to be processed. 
 * The framework includes numerous useful features, such as thread pooling and scheduling,which would be cumbersome for you to implement in every project.
 * @author tstsvetk
 *
 */
public class ExecutorServiceExample {
	private static int counter = 0;
	
	public static void main(String[] args) {
		
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			//use execute() - it doesn't return any information
			service.execute(()->System.out.println("Printing zoo inventory"));
			service.execute(()->{
				for(int i=0; i<3; i++)
					System.out.println("Printing record: " + i);
			});
			service.execute(()->System.out.println("Printing zoo inventory"));
			System.out.println("end");
			
			//using submit() - it does return information
			Future<?> result = service.submit(()->{
				for(int i=0; i<500; i++) ExecutorServiceExample.counter++;
			});
			result.get(10, TimeUnit.SECONDS);
			System.out.println("Reached!");
			
			
			
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			System.out.println("Not reached in time");
		}finally {
			if(service != null) service.shutdown();
		}
	}
}
