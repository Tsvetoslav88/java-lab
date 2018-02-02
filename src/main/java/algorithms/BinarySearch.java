package algorithms;

import java.util.Scanner;

public class BinarySearch {

	private static int binarySearch(int[] a, int begin, int end, int number) {
		int mid;
		int diff;

		if (begin > end) {
			return -1; // not found
		} else {
			mid = (begin + end) / 2;// bisect our current sub-array
			diff = a[mid] - number;// difference from target

			if (diff == 0) {// found
				return mid;
			} else if (diff > 0) {
				return binarySearch(a, begin, mid - 1, number);
			} else {
				return binarySearch(a, mid + 1, end, number);
			}

		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter begin of an array range: ");
		int beging = input.nextInt();
		
		System.out.println("Please enter end of an array range: ");
		int end = input.nextInt();
		
		int arraySize = end-beging;
		int[] array = new int[arraySize+1];
		for(int i = 0; i <= arraySize; i++){
			array[i] = beging + i;
		}
		
		
		System.out.println("Please enter searching number: ");
		int number = input.nextInt();
		
		input.close();
		
		System.out.println(binarySearch(array, 0, arraySize-1, 7)>=0 ? "Number " + number + " is found" : "Number "+ number + " is not found");

	}

}
