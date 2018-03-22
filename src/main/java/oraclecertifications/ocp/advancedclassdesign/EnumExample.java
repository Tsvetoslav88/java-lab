package oraclecertifications.ocp.advancedclassdesign;

enum Season {
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
	private String expectedVisitors;
	private Season(String expectedVisitors){
		this.expectedVisitors = expectedVisitors;
	}
	
	public void printExpectedVisitors(){
		System.out.println(this.expectedVisitors);
	}
}

public class EnumExample {
	public static void main(String[] args) {
		for(Season s: Season.values()){
			System.out.println(s.name() + " " + s.ordinal());
		}
		
		System.out.println("***********");
		
		Season s = Season.SUMMER;
		switch (s) {
		case WINTER:
			s.printExpectedVisitors();
			break;
		case SUMMER:
			s.printExpectedVisitors();
			break;
		default:
			System.out.println("Default value");
			break;
		}
	}
}
