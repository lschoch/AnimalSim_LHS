
/**
 * Sub-class of the Abstract Animal class. Represents a BrownBear object.
 * 
 * @author lschoch
 * @version 1.0 CS-131-ON AnimalSim
 */
public class BrownBear extends Animal {
	// Variable to store the value of subSpecies
	private String subSpecies;

	InvalidSubspeciesException invalSubspeciesEx = new InvalidSubspeciesException("Invalid Subspecies");

	/**
	 * Empty argument constructor. Builds an object that inherits the empty-
	 * argument parameters from the parent class and sets subSpecies to Alaskan.
	 */
	public BrownBear() {
		super();
		subSpecies = "Alaskan";

	}// end empty-argument constructor

	/**
	 * Constructor to build a BrownBear object with specified parameters.
	 * 
	 * @param simID      the value of simID, the object's integer identifier
	 * @param l          the value of l, the object's Location object
	 * @param subSpecies the value of subSpecies, the object's subspecies
	 */
	public BrownBear(int simID, Location l, String subSpecies) {
		this.simID = simID;
		this.l = l;
		this.full = false;
		this.rested = true;

		try {
			if (subspeciesValid(subSpecies))
				this.subSpecies = subSpecies;
			else
				throw (invalSubspeciesEx);
		} catch (InvalidSubspeciesException ise) {
			System.out.println(subSpecies + " -> " + ise.getMessage());
			ise.printStackTrace();
		}

	}// end preferred constructor

	/**
	 * Method to check if subSpecies is valid
	 * 
	 * @param ss the subSpecies to be checked
	 * @return true if ss is a valid subSpecies, false if not
	 */
	private boolean subspeciesValid(String ss) {
		String[] stringArray = { "Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian" };
		boolean found = false;

		for (String x : stringArray) {
			if (x.equals(ss)) {
				found = true;
				break;
			}
		}
		return found;
	}// end subspeciesCheck

	/**
	 * Getter for subSpecies
	 * 
	 * @return the current value of subSpecies
	 */
	public String getSubSpecies() {
		return subSpecies;
	}// end getSubSpecies

	/**
	 * Setter for subSpecies
	 * 
	 * @param subSpecies the subSpecies to set
	 */
	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}// end setSubSpecies

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", l=" + l + ", full=" + full + ", rested="
				+ rested + "]";
	}

}// end class
