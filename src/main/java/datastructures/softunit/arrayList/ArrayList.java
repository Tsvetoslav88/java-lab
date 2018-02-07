package datastructures.softunit.arrayList;

import java.util.Iterator;

public class ArrayList<T> implements Iterable<T> {

	 int capacity = 2;
	private T[] arr;
	private int count = 0;

	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		this.arr = (T[]) new Object[capacity];
		this.capacity = capacity;
	}

	@SuppressWarnings("unchecked")
	public ArrayList() {
		this.arr =  (T[]) new Object[capacity];
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

	@SuppressWarnings("unchecked")
	private void shrink() {
		T[] newArr = (T[]) new Object[this.capacity / 2];
		System.arraycopy(this.arr, 0, newArr, 0, this.count);
		this.arr = newArr;
	}

	@SuppressWarnings("unchecked")
	private void grow() {
		T[] newArr = (T[]) new Object[this.capacity * 2];
		System.arraycopy(this.arr, 0, newArr, 0, this.count);
		this.arr = newArr;
		this.capacity = this.capacity * 2;
	}

	public Iterator<T> iterator() {
		Iterator<T> it = new Iterator<T>() {
			
			int itCount = 0;
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return itCount < count;			}

			public T next() {
				T value = arr[itCount++];
				return value;
			}

		};
		// TODO Auto-generated method stub
		return it;
	}

	

}
