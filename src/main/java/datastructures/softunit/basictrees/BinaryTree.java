package datastructures.softunit.basictrees;

import java.util.function.Consumer;

public class BinaryTree<T> {

	public T value;
	public BinaryTree<T> child;
	public BinaryTree<T> leftChild;
	public BinaryTree<T> rightChild;

	public BinaryTree(T value) {
		this.value = value;
	}

	public BinaryTree(T value, BinaryTree<T> child) {
		this.value = value;
		this.child = child;
	}

	public BinaryTree(T value, BinaryTree<T> leftChild, BinaryTree<T> rightChild) {
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	// append output to builder
	public String printIndentedPreOrder(int indent, StringBuilder builder) {

		for (int i = 0; i < indent * 2; i++) {
			builder.append(" ");
		}
		builder.append(this.value);
		builder.append("\n");
		if (this.leftChild != null) {
			builder.append(this.leftChild.printIndentedPreOrder(indent + 1, new StringBuilder()));
		}

		if (this.rightChild != null) {
			builder.append(this.rightChild.printIndentedPreOrder(indent + 1, new StringBuilder()));
		}

		return builder.toString();
	}

	public void eachInOrder(Consumer<T> consumer) {

		if (this.leftChild != null) {
			this.leftChild.eachInOrder(consumer);
		}

		consumer.accept(this.value);

		if (this.rightChild != null) {
			this.rightChild.eachInOrder(consumer);
		}

	}

	public void eachPostOrder(Consumer<T> consumer) {
		if (this.leftChild != null) {
			this.leftChild.eachPostOrder(consumer);
		}

		if (this.rightChild != null) {
			this.rightChild.eachPostOrder(consumer);
		}

		consumer.accept(this.value);

	}
}
