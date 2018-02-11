package datastructures.softunit.basictrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Consumer;

public class Tree<T> {

	public T value;
	public List<Tree<T>> children = new ArrayList<>();

	public Tree(T value, Tree<T>... children) {

		this.value = value;
		for (Tree<T> child : children) {
			this.children.add(child);
		}
	}

	// append output to builder
	// String expectedOutput = "7\n 19\n 1\n 12\n 31\n 21\n 14\n 23\n 6\n";
	public String print(int indent, StringBuilder builder) {

		for (int i = 0; i < indent * 2; i++) {
			builder.append(" ");
		}
		builder.append(value);
		builder.append("\n");

		for (Tree<T> child : this.children) {
			builder.append(child.print(indent + 1, new StringBuilder()));
		}
		return builder.toString();
	}

	public void each(Consumer<T> consumer) {

		consumer.accept(this.value);
		for (Tree<T> child : this.children) {
			child.each(consumer);
		}
	}

	public Iterable<T> orderDFS() {
		List<T> result = new ArrayList<>();
		this.DFS(this, result);
		return result;

	}

	private void DFS(Tree<T> node, List<T> result) {

		for (Tree<T> child : node.children) {
			this.DFS(child, result);
		}

		result.add(node.value);
	}

	public Iterable<T> orderBFS() {
		Queue<Tree<T>> queue = new LinkedList<>();
		List<T> result = new ArrayList<>();

		queue.add(this);

		while (queue.size() > 0) {
			Tree<T> current = queue.remove();
			result.add(current.value);

			for (Tree<T> child : current.children) {
				queue.add(child);
			}
		}

		return result;

	}

}