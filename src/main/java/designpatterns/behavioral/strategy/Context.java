package designpatterns.behavioral.strategy;

public class Context {
	
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void arrange(int[] input) {
		strategy.sort(input);
	}
}
