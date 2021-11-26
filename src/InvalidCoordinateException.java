
/**
 * Exception to be thrown when a negative coordinate is entered. Constructs an
 * InvalidCoordinateException with the specified detail message.
 * 
 * @author lschoch
 * @version 1.0 CS-131-ON AnimalSim
 */
@SuppressWarnings("serial")
public class InvalidCoordinateException extends RuntimeException {
	InvalidCoordinateException(String message) {
		super(message);
	}// end constructor

}// end class