
/**
 * Exception to be thrown when a wingspan is out of range. Constructs an
 * InvalidWingspanException with the specified detail message.
 * 
 * @author lschoch
 * @version 1.0 CS-131-ON AnimalSim
 */
@SuppressWarnings("serial")
public class InvalidWingspanException extends RuntimeException {
	InvalidWingspanException(String message) {
		super(message);
	}// end constructor

}// end class