package datastructures.softunit.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BinarySearchTree<T extends Comparable<T>> {
	private Node root;

	public BinarySearchTree() {
	}

	// public BinarySearchTree(Node root) {
	// super();
	// this.root = root;
	// }

	public Node getRoot() {
		return this.root;
	}

	public void insert(T value) {
		this.root = insert(this.root, value);
	}

	private Node insert(Node node, T value) {

		if (node == null) {
			node = new Node(value);
		} else {
			int compare = node.value.compareTo(value);
			if (compare > 0) {
				node.setLeft(insert(node.getLeft(), value));
			} else if (compare < 0) {
				node.setRight(insert(node.getRight(), value));
			}
		}
		return node;
	}

	public boolean contains(T value) {

		// First implementation with iterative approach
		Node current = this.root;
		while (current != null) {
			int compare = current.value.compareTo(value);
			if (compare > 0) {
				current = current.getLeft();
			} else if (compare < 0) {
				current = current.getRight();
			} else {// If search value is found
				return true;
			}

		}

		return false;
		// return contains(this.root, value)!=null;//Second implementation with
		// recursion
	}

	private T contains(Node node, T value) {

		T searchValue = null;

		if (node.value != null) {
			if (node.value.compareTo(value) == 0) {
				searchValue = value;
			}
			if (node.getLeft() != null && searchValue == null) {
				searchValue = contains(node.getLeft(), value);
			}
			if (node.getRight() != null && searchValue == null) {
				searchValue = contains(node.getRight(), value);
			}
		}

		return searchValue;
	}

	public BinarySearchTree<T> search(T item) {

		Node current = this.root;

		while (current != null) {
			int compare = current.getValue().compareTo(item);
			if (compare > 0) {
				current = current.getLeft();
			} else if (compare < 0) {
				current = current.getRight();
			} else {
				return createNewBinarySearchTree(current);
				// return new BinarySearchTree<>(current);
			}
		}

		return null;
	}

	private BinarySearchTree<T> createNewBinarySearchTree(Node node) {
		BinarySearchTree<T> binary = new BinarySearchTree<T>();
		binary.root = this.insert(node, node.value);

		return binary;
	}

	public void eachInOrder(Consumer<T> consumer) {
		eachInOrder(this.root, consumer);
	}

	private void eachInOrder(Node node, Consumer<T> consumer) {
		if (node != null) {
			this.eachInOrder(node.getLeft(), consumer);
			consumer.accept(node.getValue());
			this.eachInOrder(node.getRight(), consumer);

		}
	}

	public void deleteMin(){
		
		if(this.root == null){
			return;
		}

		if(root.getLeft() == null && root.getRight() == null){
			this.root = null;
		}else{
			Node parent = null;
			Node current = this.root;
			
			
			while(current.getLeft() != null){
				parent = current;
				current = current.getLeft();
			}
			
			if(current.getRight() != null){
				parent.setLeft(current.getRight());
			}else{
				parent.setLeft(null);
			}

		}
		
	}
	
	public Iterable<T> range(T from, T to) {
		List<T> list = new ArrayList<>();
		this.range(this.root, list, from, to);
		return list;
	}
	
	private void range(Node node, List<T> list, T from, T to){
		if(node != null){
			int compareLow = node.getValue().compareTo(from);
			int compareHigh = node.getValue().compareTo(to);
			if(compareLow > 0){
				range(node.getLeft(), list, from, to);
			}
			
			if(compareLow >= 0 && compareHigh <= 0){
				list.add(node.getValue());
			}
			
			if(compareHigh < 0){
				range(node.getRight(), list, from, to);
			}
		}
	}

	class Node {
		private T value;
		private Node left;
		private Node right;

		public Node(T value) {
			this.value = value;
		}

		public T getValue() {
			return this.value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node getLeft() {
			return this.left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return this.right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

	}
}
