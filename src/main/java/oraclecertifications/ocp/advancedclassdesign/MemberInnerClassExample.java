package oraclecertifications.ocp.advancedclassdesign;

public class MemberInnerClassExample {
	private String greeting = "Hi";
	
	protected class Inner{
		public int repeat = 3;
		public void go(){
			for(int i=0; i<repeat; i++){
				System.out.println(greeting);
			}
		}
	}
	
	public void callInner(){
		Inner inner = new Inner();
		inner.go();
	}
	
	public static void main(String[] args) {
		MemberInnerClassExample test = new MemberInnerClassExample();
		test.callInner();
		
		System.out.println();
		///////Second way to instantiate inner class
		Inner inner = test.new Inner();
		inner.go();
	}
}
