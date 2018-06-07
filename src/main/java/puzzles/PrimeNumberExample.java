package puzzles;

public class PrimeNumberExample {
	public static boolean isPrime(int number) {
		if(number < 2) {
			throw new IllegalArgumentException("Input should be number above 2");
		}
		
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
