package crackingthecodinginterview.treesandgraphs;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		this.key = item;
	}
}

class BinaryTree {
	// Root of Binary Tree
	Node root;

	public BinaryTree() {
		this.root = null;
	}

	/*
	 * Given a binary tree, print its nodes according to the "bottom-up"
	 * postorder traversal.
	 */
	private void printPostorder(Node root2) {
		if (root2 == null) {
			return;
		}

		// first recur on left subtree
		printPostorder(root2.left);

		// then recur on right subtree
		printPostorder(root2.right);

		// now deal with the node
		System.out.print(root2.key + " ");

	}

	/* Given a binary tree, print its nodes in inorder */
	private void printInorder(Node root2) {
		if (root2 == null) {
			return;
		}

		/* first recur on left child */
		printInorder(root2.left);

		/* then print the data of node */
		System.out.print(root2.key + " ");

		/* now recur on right child */
		printInorder(root2.right);

	}

	/* Given a binary tree, print its nodes in preorder */
	private void printPreorder(Node root2) {
		if (root2 == null) {
			return;
		}

		/* first print data of node */
		System.out.print(root2.key + " ");

		/* then recur on left subtree */
		printPreorder(root2.left);

		/* now recur on right subtree */
		printPreorder(root2.right);
	}

	// Wrappers over above recursive functions
	void printPostorder() {
		printPostorder(root);
	}

	void printInorder() {
		printInorder(root);
	}

	void printPreorder() {
		printPreorder(root);
	}
}

public class BinaryTreeExample {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Preorder traversal of binary tree is ");
		tree.printPreorder();

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder();

	}
}
