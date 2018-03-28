package oraclecertifications.ocp.genericsandcollections;

class Create<T>{
	private T contents;
	public T emptyCreate(){
		return this.contents;
	}
	
	public void packCreate(T contents){
		this.contents = contents;
	}
}

public class GenericClassExample {
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		elephant.setName("Elephant");
		Create<Elephant> createForElephant = new Create();
		createForElephant.packCreate(elephant);
		createForElephant.emptyCreate();
		Elephant inNewHome = createForElephant.emptyCreate();
		System.out.println(inNewHome.getName());
	}
}

class Elephant{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Zebra{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
