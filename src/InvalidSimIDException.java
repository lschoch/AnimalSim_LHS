
/**
 * Exception to be thrown when a negative simID is entered. Constructs an
 * InvalidSimIDException with the specified detail message.
 * 
 * @author lschoch
 * @version 1.0 CS-131-ON AnimalSim
 */
@SuppressWarnings("serial")
public class InvalidSimIDException extends RuntimeException {
	InvalidSimIDException(String message) {
		super(message);
	}// end constructor

}// end class