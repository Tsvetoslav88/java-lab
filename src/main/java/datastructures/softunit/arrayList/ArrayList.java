package datastructures.softunit.arrayList;

public class ArrayList<T>{
	
	private int capacity = 2;
	private Object[] arr;
	private int count = 0;
	
	
	public ArrayList(int capacity){
		this.arr = new Object[capacity];
		this.capacity = capacity;
	}
	
	public ArrayList(){
		this.arr = new Object[capacity];
	}

	
	public int getCount() {
		return this.count;
	}


	@SuppressWarnings("unchecked")
	public T get(int index) {
		if(index < 0 || index >= this.capacity){
			throw new IndexOutOfBoundsException();
		}
		return (T) this.arr[index];
	}


	public void add(T element) {
		if(this.count + 1 >= this.capacity){
			this.grow();
		}
		this.arr[count] = element;
		count++;
	}

	public T removeAt(int index) {
		return null;
	}
	

	public void set(int i, T item) {
	}
	
	private void grow(){
		Object[] newArr = new Object[capacity * 2];
		System.arraycopy(this.arr, 0, newArr, 0, this.count);
		this.arr = newArr;
	}
	
}
