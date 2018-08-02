package algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * A level-order traversal of tree is a recursive algorithm that processes the
 * root, followed by the children of the root (from left to right), followed by
 * the grandchildren of the root (from left to right), etc. The basic algorithm
 * shown below uses a queue of references to binary trees to keep track of the
 * subtrees at each level:
 * 
 * @author tstsvetk
 *
 */
class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BFS {
	private static void levelOrder(Node root) {

		// Queue for Node elements
		Queue<Node> queueNode = new LinkedList<>();
		if (root != null) {

			// enqueue current root
			queueNode.add(root);

			// while there are nodes to process
			while (!queueNode.isEmpty()) {

				// dequeue next node
				Node node = queueNode.remove();
				System.out.print(node.data + " ");

				// enqueue child elements from next level in order
				if (node.left != null) {
					queueNode.add(node.left);
				}
				if (node.right != null) {
					queueNode.add(node.right);
				}

			}
		}

	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}
