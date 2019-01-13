package crackingthecodinginterview.sortingandserching;

public class BubbleSortExample {

	public static void main(String[] args) {

		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		System.out.println("Array before bubble sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		bubbleSort(arr);// sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		int tmp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - 1); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}

	}
}
