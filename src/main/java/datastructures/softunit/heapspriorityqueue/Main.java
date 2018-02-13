package datastructures.softunit.heapspriorityqueue;

public class Main {

    public static void main(String[] args) {
    	
    	BinaryHeap<Integer> heap = new BinaryHeap<>();
    	heap.insert(5);
    	heap.insert(8);
    	heap.insert(1);
    	heap.insert(3);
    	heap.insert(12);
    	heap.insert(-4);
    	heap.insert(18);
    	heap.insert(20);
    	
    	System.out.println(heap);
    	/*
    	 * Console.WriteLine("Heap elements (max to min):");
        while (heap.Count > 0)
        {
            var max = heap.Pull();
            Console.WriteLine(max);
        }
    	 * */
    }
}
