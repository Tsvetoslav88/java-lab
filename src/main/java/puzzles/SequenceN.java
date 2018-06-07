package puzzles;

import java.util.LinkedList;
import java.util.Queue;

/**
 * S = N, N+1, 2*N, N+2, 2*(N+1), 2*N+1, N*4,...
 * 
 * @author TSVETOSLAV
 *
 */
public class SequenceN {

	public static void main(String[] args) {
		int n = 3;
		int p = 5;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);
		int index = 0;
		while (queue.size() > 0) {
			int current = queue.remove();
			index++;
			if (current == p) {
				System.out.println("Found at index " + index);
				break;
			}
			queue.add(current + 1);
			queue.add(2 * current);
		}
	}

}
