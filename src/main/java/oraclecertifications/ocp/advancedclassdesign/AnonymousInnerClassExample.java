package oraclecertifications.ocp.advancedclassdesign;


public class AnonymousInnerClassExample {
	interface SaleTodayOnly{
		int dollarsOff();
	}

	public int admission(int basePrice){
		SaleTodayOnly sale = new SaleTodayOnly() {
			
			@Override
			public int dollarsOff() {
				// TODO Auto-generated method stub
				return 3;
			}
		};
		
		return basePrice + sale.dollarsOff();
	}
	
	public static void main(String[] args) {
		AnonymousInnerClassExample test = new AnonymousInnerClassExample();
		System.out.println(test.admission(5));
	}
	
}
