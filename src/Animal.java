
/**
 * Abstract class to encapsulate a generic animal that can be sub-classed by
 * other classes.
 * 
 * @author lschoch
 * @version 1.0 CS-131-ON AnimalSim
 */
public abstract class Animal {
	// Integer identifier for each animal.
	protected int simID;
	// Location object that encapsulates the animal's x and y coordinates in
	// the simulation world.
	protected Location l;
	// Boolean variable to store the animal's state of satiety.
	protected boolean full;
	// Boolean variable to store the animal's state of rest.
	protected boolean rested;
	private InvalidSimIDException invalSimIDEx = 
			new InvalidSimIDException("simID cannot be negative.");

	/**
	 * The empty-argument constructor for this object
	 */
	public Animal() {
		simID = 0;
		l = new Location(0, 0);
		full = false;
		rested = true;
	}// end empty-argument constructor

	/**
	 * This constructor builds an object, some of the parameters are passed in.
	 * 
	 * @param simID the unique integer identifier for this object
	 * @param l     the Location object that encapsulates the object's coordinates
	 *              in the simulation world
	 */
	public Animal(int simID, Location l) {
		try {
			if (simID < 0)
				throw (invalSimIDEx);
			else
				this.simID = simID;
		} catch (InvalidSimIDException ise) {
			System.out.println(simID + " => invalid simID, " + ise.getMessage());
		}

		this.l = l;
		full = false;
		rested = true;
	}// end preferred constructor

	/**
	 * Method to randomly set the object's state of satiety.
	 */
	public void eat() {
		double r = Math.random();
		if (r > 0.5)
			full = true;
		else
			full = false;
	}// end eat

	/**
	 * Method to randomly set the object's state of rest.
	 */
	public void sleep() {
		double r = Math.random();
		if (r > 0.5)
			rested = true;
		else
			rested = false;
	}// end sleep

	/**
	 * Method to get the value of simID.
	 * 
	 * @return the current value of simID
	 */
	public int getSimID() {
		return simID;
	}// end getSimID

	/**
	 * Method to set the value of simID.
	 * 
	 * @param simID the value of simID to be set
	 */
	public void setSimID(int simID) {
		try {
				if (simID < 0) 
					throw(invalSimIDEx);
				else
					this.simID = simID;
		} catch(InvalidSimIDException ise) {
			System.out.println(simID + " -> invalid simID, " + ise.getMessage());
		}
	}// end setSimID

	/**
	 * Method to get the values encapsulated by the Location object l.
	 * 
	 * @return the current values encapsulated by the Location object l
	 */
	public Location getL() {
		return l;
	}// end getL

	/**
	 * Method to set the Location object l.
	 * 
	 * @param l the Location object to be set
	 */
	public void setL(Location l) {
		this.l = l;
	}// end setL

	/**
	 * Method to determine the object's state of satiety.
	 * 
	 * @return true if the object is full, false otherwise.
	 */
	public boolean isFull() {
		return full;
	}// end isFull

	/**
	 * Method to set the object's state of satiety.
	 * 
	 * @param full the object's state of satiety to be set
	 */
	public void setFull(boolean full) {
		this.full = full;
	}// end setFull

	/**
	 * Method to determine the object's state of rest.
	 * 
	 * @return true if the object is rested, false otherwise
	 */
	public boolean isRested() {
		return rested;
	}// end isRested

	/**
	 * Method to set the object's state of rest.
	 * 
	 * @param rested the object's state of rest to be set
	 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}// end setRested

}// end class
