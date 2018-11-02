package designpatterns.behavioral.observer;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new HexaObserver(subject);
		new BinaryObserver(subject);
		new OctalObserver(subject);
		
		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 20");
		subject.setState(20);
		
	}
}
