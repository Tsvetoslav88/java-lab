package datastructures.softunit.heapspriorityqueue;

public class Heap<E extends Comparable<E>> {

    public static <E> void sort(E[] arr) {
        constructHeap(arr);
        heapSort(arr);
    }
    
    
    
    private static <E> void heapSort(E[] arr) {
    	for(int index = arr.length - 1; index>=0; index--){
    		swap(arr, 0, index);
    		heapifyDown(arr, 0, index);
    	}
	}



	private static <E> void constructHeap(E[] arr){
    	for(int index = arr.length/2; index >= 0; index--){
    		heapifyDown(arr, index, arr.length);
    	}
    }
    
    private static <E> void heapifyDown(E[] arr,/* E element, */int index, int length) {
		
		if(index < length/2){
			
			//Left child
			int childIndex = (index * 2) + 1;
			
			//Check if there is a right child && rightChild > leftChild
			if(childIndex + 1 < length && !isGreater(arr, childIndex, childIndex + 1)){//if left child is smaller than right
				//rightChild = leftChild + 1 
				childIndex += 1;
			}
			
			//Compare currentElement with bigger child element
			@SuppressWarnings("unchecked")
			int compare = ((Comparable<E>) arr[index]).compareTo(arr[childIndex]);
			if(compare < 0){
				swap(arr, index, childIndex);
				heapifyDown(arr, /*arr[childIndex],*/ childIndex, length);
			}
		}
		
	}
    
    private static <E> void swap(E[] arr, int parent, int index){
    	E temp = arr[parent];
    	arr[parent] = arr[index];
    	arr[index] = temp;
    }
    
    @SuppressWarnings("unchecked")
	private static <E> boolean isGreater(E[] arr, int firstIndex, int secondIndex){
		return ((Comparable<E>) arr[firstIndex]).compareTo(arr[secondIndex]) > 0;
	}
}
