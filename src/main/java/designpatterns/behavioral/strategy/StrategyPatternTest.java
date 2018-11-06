package designpatterns.behavioral.strategy;

public class StrategyPatternTest {

	public static void main(String[] args) {
		int[] var = {1, 2, 3, 4, 5};
		
		Context ctx = new Context(new BubbleSort());
		ctx.arrange(var);
		
		ctx = new Context(new QuickSort());
		ctx.arrange(var);

	}

}
