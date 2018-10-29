package designpatterns.structural.adapter;

public class AppleAdapter extends Apple{

	//The purpose of the sample problem is to adapt an orange as an apple
	private Orange orange;
	
	public AppleAdapter(Orange orange) {
		this.orange = orange;
	}
	
	public void getColor(String color) {
		orange.getOrangeColor(color);
	}
	
}
