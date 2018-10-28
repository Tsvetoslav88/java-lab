package designpatterns.creational.builder;

public class Cake {
	private final double sugar;
	private final double butter;
	private final double milk;
	private final int cherry;

	public static class CakeBuilder {
		private double suger;
		private double butter;
		private double milk;
		private int cherry;

		// builder methods for setting property
		public CakeBuilder suger(double cup) {
			this.suger = cup;
			return this;
		}

		public CakeBuilder butter(double cup) {
			this.butter = cup;
			return this;
		}

		public CakeBuilder milk(double cup) {
			this.milk = cup;
			return this;
		}

		public CakeBuilder cherry(int cup) {
			this.cherry = cup;
			return this;
		}

		// return fully build object
		public Cake build() {
			return new Cake(this);
		}

	}

	// private constructor to enforce object creation through builder
	private Cake(CakeBuilder builder) {
		this.sugar = builder.suger;
		this.butter = builder.butter;
		this.milk = builder.milk;
		this.cherry = builder.cherry;
	}

	@Override
	public String toString() {
		return "Cake [sugar=" + sugar + ", butter=" + butter + ", milk=" + milk + ", cherry=" + cherry + "]";
	}

}
