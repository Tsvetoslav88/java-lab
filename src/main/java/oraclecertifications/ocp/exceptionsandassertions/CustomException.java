package oraclecertifications.ocp.exceptionsandassertions;

public class CustomException{

	public static void main(String[] args) {
		try {
			throw new CannotSwimException(new RuntimeException());
		} catch (CannotSwimException e) {
			e.printStackTrace();
		}
	}
}

class CannotSwimException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CannotSwimException() {
		super();
	}

	public CannotSwimException(Exception e) {
		super(e);
	}

	public CannotSwimException(String message) {
		super(message);
	}
}