package crackingthecodinginterview.sortingandserching;

public class QuickSortExample {

	public static void main(String[] args) {
		int[] arr = { 10, 80, 30, 90, 40, 50, 70 };
		int n = arr.length;
		QuickSortExample quickSort = new QuickSortExample();
		quickSort.sort(arr, 0, n);

		System.out.println("sorted array");
		printArray(arr);
	}

	/* A utility function to print array of size n */
	private static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be sorted,
	 * low --> Starting index, high --> Ending index
	 */
	private void sort(int[] arr, int low, int high) {

		if (low < high) {

			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);

		}

	}

	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	private int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {

			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {

				i++;

				// swap arr[i] and arr[j]
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}

		}

		// swap arr[i+1] and arr[high] (or pivot)
		int tmp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = tmp;

		return i + 1;
	}
}
