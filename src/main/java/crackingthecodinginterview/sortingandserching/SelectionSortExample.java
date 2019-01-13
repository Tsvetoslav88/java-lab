package crackingthecodinginterview.sortingandserching;

public class SelectionSortExample {

	public static void main(String[] args) {

		int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before Selection Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();

		selectionSort(arr1);// sorting array using selection sort

		System.out.println("After Selection Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

	private static void selectionSort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int index = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[index]) {
					index = j;// searching for lowest index
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;

		}

	}

}
