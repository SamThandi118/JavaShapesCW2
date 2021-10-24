package co1105.cw2.st500;
// Creates subclass of exception called InvalidSolidException
public class InvalidSolidException extends Exception {
	// makes a new exception with null as the message
	  public InvalidSolidException() {
		  super();
	  }
	  // Makes a new exception with a message
	  public InvalidSolidException(String message) {
	    super(message);
	  }
	}