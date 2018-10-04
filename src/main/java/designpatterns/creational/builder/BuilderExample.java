package designpatterns.creational.builder;

class Manu{
	
	private String name;

	public Manu(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Manu [name=" + name + "]";
	}
	
}

class ToolBar{
	private String name;

	public ToolBar(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "ToolBar [name=" + name + "]";
	}
	
}

class MainWindow{
	Manu menu;
	ToolBar boolBar;
	public Manu getMenu() {
		return menu;
	}
	public void setMenu(Manu menu) {
		this.menu = menu;
	}
	public ToolBar getBoolBar() {
		return boolBar;
	}
	public void setBoolBar(ToolBar boolBar) {
		this.boolBar = boolBar;
	}
	
}

class WindowBuilder{
	public static MainWindow createWindow() {
		MainWindow window = new MainWindow();
		window.setMenu(new Manu("Main menu"));
		window.setBoolBar(new ToolBar("Main toolbar"));
		
		return window;
	}
}

public class BuilderExample {

	
	
	public static void main(String[] args) {
	    MainWindow object = WindowBuilder.createWindow();
	    System.out.println(object.getMenu());
	    System.out.println(object.getBoolBar());

	}

}
