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

	// Wrappers over above recursive functions
	void printPostorder() {
		printPostorder(this.root);
	}

	private void printPostorder(Node root2) {
		// TODO Auto-generated method stub
		
	}

	void printInorder() {
		printInorder(this.root);
	}

	private void printInorder(Node root2) {
		if(root2 == null) {
			return;
		}
		
		printInorder(root2.left);
		
		System.out.print(root2.key + " ");
		
		printInorder(root2.right);
		
		
		
	}

	void printPreorder() {
		printPreorder(this.root);
	}

	private void printPreorder(Node root2) {
		// TODO Auto-generated method stub
		
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

		tree.printInorder();
		
	}
}
