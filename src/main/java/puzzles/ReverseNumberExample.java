package puzzles;

public class ReverseNumberExample {
	public static int reverse(int number) {

		if(number<0){
    		throw new IllegalArgumentException("Input should be positive number");
    	}
		
		int reverse = 0;
		int reminder = 0;
		
		do {
			reminder = number%10;
			reverse = reverse*10 + reminder;
			number = number/10;
		}while(number>0);
		
		return reverse;
	}
}
