package api;

public class SingleObject {
	// create an object of SingleObject
	private static SingleObject instance = new SingleObject();

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
	}

	// Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}

	public String getMessage() {
		return this.message;
	}

	private String message;

	public void setMessage(String message) {
		this.message = message;

	}

	public void showMessage() {
		System.out.println(this.getMessage());
	}
}
