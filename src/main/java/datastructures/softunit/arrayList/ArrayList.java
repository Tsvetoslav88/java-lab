package datastructures.softunit.arrayList;

public class ArrayList<T> {

	private int capacity = 2;
	private Object[] arr;
	private int count = 0;

	public ArrayList(int capacity) {
		this.arr = new Object[capacity];
		this.capacity = capacity;
	}

	public ArrayList() {
		this.arr = new Object[capacity];
	}

	public int getCount() {
		return this.count;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (index < 0 || index >= this.capacity) {
			throw new IllegalArgumentException();
		}
		return (T) this.arr[index];
	}

	public void add(T element) {
		if (this.count + 1 >= this.capacity) {
			this.grow();
		}
		this.arr[count] = element;
		count++;
	}

	public T removeAt(int index) {
		T item = this.get(index);
		// this[index] = default(T);
		this.shiftLeft(index);

		if (this.capacity / 3 > this.count - 1) {
			shrink();
		}
		this.count--;
		return item;
	}

	public void set(int i, T item) {
		if (i < 0 || i >= this.capacity) {
			throw new IllegalArgumentException();
		}
		this.arr[i] = item;

	}

	private void shiftLeft(int index) {
		for (int i = index; i < this.count - 1; i++) {
			this.arr[i] = this.arr[i + 1];
		}
	}

	private void shrink() {
		Object[] newArr = new Object[this.capacity / 2];
		System.arraycopy(this.arr, 0, newArr, 0, this.count);
		this.arr = newArr;
	}

	private void grow() {
		Object[] newArr = new Object[this.capacity * 2];
		System.arraycopy(this.arr, 0, newArr, 0, this.count);
		this.arr = newArr;
		this.capacity = this.capacity * 2;
	}

}
