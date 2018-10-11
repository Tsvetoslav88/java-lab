package designpatterns.structural.bridge;

interface Printer{
	public void print(int radius, int x, int y);
}

class ColorPrinter implements Printer{

	@Override
	public void print(int radius, int x, int y) {
		System.out.println("Color: " + radius +", x: " +x+", "+ y +"]");
		
	}
}

class BlackPrinter implements Printer{

	@Override
	public void print(int radius, int x, int y) {
		System.out.println("Black: " + radius +", x: " +x+", "+ y +"]");
		
	}
}

abstract class Shape{
	protected Printer printer;
	
	public Shape(Printer p) {
		this.printer = p;
	}
	
	public abstract void draw(); 
}

class Circle extends Shape{
	private int x, y, radius;

	protected Circle(int x, int y, int radius, Printer draw) {
		super(draw);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		printer.print(radius, x, y);
		
	}
}

public class Main {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new ColorPrinter());
		Shape blackCicle = new Circle(100, 100, 10, new BlackPrinter());
		
		redCircle.draw();
		blackCicle.draw();
	}
}
