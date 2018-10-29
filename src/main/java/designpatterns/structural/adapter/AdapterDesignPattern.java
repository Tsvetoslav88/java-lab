package designpatterns.structural.adapter;

public class AdapterDesignPattern {
	
	public static void main(String[] args) {
		Apple apple1 = new Apple();
		apple1.getAppleColor("green");
		
		Orange orange = new Orange();
		AppleAdapter adapter = new AppleAdapter(orange);
		adapter.getAppleColor("red");
	}
}
