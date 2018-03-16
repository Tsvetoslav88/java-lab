package oraclecertifications.ocp.advancedclassdesign;

public class EqualsExample {
	private int idNumber;
	private int age;
	private String name;
	
	EqualsExample(int idNumber, int age, String name){
		this.idNumber = idNumber;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof EqualsExample)) return false;
		EqualsExample otherLion = (EqualsExample) obj;
		return this.idNumber == otherLion.idNumber;
	}
	
	public static void main(String[] args) {
		EqualsExample example1 = new EqualsExample(1, 10, "example1");
		EqualsExample example2 = new EqualsExample(1, 10, "example1");
		EqualsExample example3 = new EqualsExample(3, 10, "example3");
		
		if(example1.equals(example2)){
			System.out.println("Example1 is equal to Example2");
		}else{
			System.out.println("Example1 is not equal to Example2");
		}
		
		if(example1.equals(example3)){
			System.out.println("Example1 is equal to Example3");
		}else{
			System.out.println("Example1 is not equal to Example3");
		}
	}
}
