package myExceptions;

public class NotATriangleException extends Exception {

	private static final long serialVersionUID = 1L;

	public NotATriangleException() {
		super();
	}

	public NotATriangleException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NotATriangleException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotATriangleException(String message) {
		super(message);
	}

	public NotATriangleException(Throwable cause) {
		super(cause);
	}
	

		

}
