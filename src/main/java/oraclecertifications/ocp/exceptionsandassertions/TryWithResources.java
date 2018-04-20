package oraclecertifications.ocp.exceptionsandassertions;

public class TryWithResources implements AutoCloseable {
	public void close() {
		System.out.println("Close gate");
	}

	public static void main(String[] args) {
		try (TryWithResources t = new TryWithResources()) {
			System.out.println("put turkeys in");
		}
	}
}
