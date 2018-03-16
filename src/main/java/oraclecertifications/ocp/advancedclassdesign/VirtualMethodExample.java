package oraclecertifications.ocp.advancedclassdesign;

abstract class AnimalNew{
	String name = "???";
	
	public void printName(){
		System.out.println(name);
	}
	
	public void careFor(){
		play();
	}
	
	public void play(){
		System.out.println("pet animal");
		System.out.println(name);
	}
}

class Lion extends AnimalNew{
	String name = "Leo";
	public void play(){
		System.out.println("toss in meat");
	}
}

public class VirtualMethodExample {
	public static void main(String[] args) {
		AnimalNew animal = new Lion();
		animal.careFor();// Print "toss in meat" because play() method is override in subclass
		animal.printName();// Print "???" The name declared in Lion would only be used if name was referred to from Lion (or a subclass of Lion.)
	}
}
