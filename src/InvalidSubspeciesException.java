
/**
 * Exception to be thrown when an invalid subspecies is entered. Constructs an
 * InvalidSubspeciesException with the specified detail message.
 * 
 * @author lschoch
 * @version 1.0 CS-131-ON AnimalSim
 */
@SuppressWarnings("serial")
public class InvalidSubspeciesException extends RuntimeException {
	InvalidSubspeciesException(String message) {
		super(message);
	}// end constructor

}// end class