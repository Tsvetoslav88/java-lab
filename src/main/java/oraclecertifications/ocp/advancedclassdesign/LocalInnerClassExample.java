package oraclecertifications.ocp.advancedclassdesign;

public class LocalInnerClassExample {
	private int lengh = 5;
	public void calculate(){
		final int width = 20;
		class Inner{
			public void multiply(){
				System.out.println(lengh * width);
			}
		}
		
		Inner inner = new Inner();
		inner.multiply();
	}
	
	public static void main(String[] args) {
		LocalInnerClassExample test = new LocalInnerClassExample();
		test.calculate();
	}
}
