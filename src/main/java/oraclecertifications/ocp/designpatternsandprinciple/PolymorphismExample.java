package oraclecertifications.ocp.designpatternsandprinciple;

class Primate {
	public boolean hasHair() {
		return true;
	}
}

interface HasTail {
	public boolean isTailStriped();
}

public class PolymorphismExample extends Primate implements HasTail {

	public int age = 10;

	@Override
	public boolean isTailStriped() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		PolymorphismExample test = new PolymorphismExample();
		System.out.println(test.age);
		
		HasTail hasTail = test;
		System.out.println(hasTail.isTailStriped());
		
		Primate primate = test;
		System.out.println(primate.hasHair());
		
		if(test instanceof Primate){
			System.out.println("Currect class is instance of Primate");
		}
		
		///Test if casting is possible 
		Primate primateTest = new Primate();
		if(primateTest instanceof PolymorphismExample){
			System.out.println("Casting is possible");
		}else{
			System.out.println("Casting is not possible");
		}
		
//		PolymorphismExample test2 = (PolymorphismExample) primateTest;// Object reference Primate is pointing to Priamte object which is not related to PolymorphismExample object, is not possible casting
		primateTest = test;//Change Primate referance to Subclass  PolymorphismExample
		PolymorphismExample test2 = (PolymorphismExample) primateTest;//Referance casting is possible
		
	}
}
