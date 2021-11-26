
/**
 * Sub-class of the Abstract Animal class. Represents a Goldfinch object.
 * 
 * @author lschoch
 * @version 1.0 CS-131-ON AnimalSim
 */
public class Goldfinch extends Animal implements Walkable, Flyable {
	// Variable to hold the wingspan in cm of the object.
	private double wingSpan;

	InvalidWingspanException invalWingspanEx = new InvalidWingspanException("Wingspan must be between 5.0 and 11.0.");

	/**
	 * Empty argument constructor. Builds an object that inherits the empty-
	 * argument parameters from the parent class and sets wingSpan to 9.0.
	 */
	Goldfinch() {
		super();
		wingSpan = 9.0;
	}// end empty-argument constructor

	/**
	 * Constructor to build a Goldfinch object with specified parameters.
	 * 
	 * @param simID the value of simID, the object's integer identifier
	 * @param l     the value of l, the object's Location object
	 * @param ws    the value of wingSpan, the object's wingspan
	 */
	Goldfinch(int simID, Location l, double ws) {
		this.simID = simID;
		this.l = l;
		full = false;
		rested = true;
		try {
			if (ws > 5.0 && ws < 11.0)
				wingSpan = ws;
			else
				throw (invalWingspanEx);
		} catch (InvalidWingspanException iwe) {
			System.out.println(ws + " -> Invalid Wingspan. " + iwe.getMessage());
			iwe.printStackTrace();
		}
	}// end preferred constructor
	
	@Override
	public void fly(Location l) {
		setL(l);
	}// end fly

	@Override
	public void walk(int direction) {
		// TODO Auto-generated method stub
		
	}// end walk

	/**
	 * Method to get the value of wingSpan.
	 * 
	 * @return the current value of wingSpan
	 */
	public double getWingSpan() {
		return wingSpan;
	}// end getWingSpan

	/**
	 * Method to set the value for wingSpan.
	 * 
	 * @param wingSpan the wingSpan to set
	 */
	public void setWingSpan(double ws) {
		wingSpan = ws;
	}// end setWingSpan

	/**
	 * Method to create a formatted string containing the class data.
	 * 
	 * @return formatted string containing the class data
	 */
	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", l=" + l + ", full=" + full + ", rested="
				+ rested + "]";
	}// end toString

}// end class
