package myExceptions;

public class OutOfBoundPointException  extends Exception{
	
	private static final long serialVersionUID = 1L;

	public OutOfBoundPointException() {
		super();
	}

	public OutOfBoundPointException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public OutOfBoundPointException(String message, Throwable cause) {
		super(message, cause);
	}

	public OutOfBoundPointException(String message) {
		super(message);
	}

	public OutOfBoundPointException(Throwable cause) {
		super(cause);
	}
	
	

}
