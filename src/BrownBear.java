
/**
 * Sub-class of the Abstract Animal class. Represents a BrownBear object.
 * 
 * @author lschoch
 * @version 1.0 CS-131-ON AnimalSim
 */
public class BrownBear extends Animal implements Walkable, Swimmable {
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
			//ise.printStackTrace();
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
	
	@Override
	public void swim(int direction) {
		int [] coord = l.getCoordinates();
		String str = "Negative coordinates not allowed. BrownBear did not move.";
		
		// Modify coordinates to reflect a move of two units in the specified 
		// direction.
		switch (direction) {
		case 1:		coord[0]+=2;
					break;
		case 2: 	coord[1]+=2;
					break;
		case -1:	if (coord[0]>1) {
						coord[0]-=2;
						break;
					}
					else {
						coord[0]=0;
						break;
					}
		case -2:	if (coord[1]>1) {
						coord[1]-=2;
						break;
					}
					else {
						coord[1]=0;
						break;
					}
		default:	System.out.println(str);
		}// end switch
		
		// Update location object to the new coordinates
		l.update(coord[0], coord[1]);
		
	}// end swim

	@Override
	public void walk(int direction) {
		int [] coord = l.getCoordinates();
		String str = "Negative coordinates not allowed. BrownBear did not move.";
		
		// Modify coordinates to reflect a move of three units in the specified 
		// direction.
		switch (direction) {
		case 1:		coord[0]+=3;
					break;
		case 2: 	coord[1]+=3;
					break;
		case -1:	if (coord[0]>2) {
						coord[0]-=3;
						break;
					}
					else {
						coord[0]=0;
						break;
					}
		case -2:	if (coord[1]>2) {
						coord[1]-=3;
						break;
					}
					else {
						coord[1]=0;
						break;
					}
		default:	System.out.println(str);
		}// end switch
		
		// Update location object to the new coordinates
		l.update(coord[0], coord[1]);
		
	}// end walk

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
		try {
			if (subspeciesValid(subSpecies))
				this.subSpecies = subSpecies;
			else
				throw (invalSubspeciesEx);
		} catch (InvalidSubspeciesException ise) {
			System.out.println(subSpecies + " -> " + ise.getMessage());
			//ise.printStackTrace();
		}
	}// end setSubSpecies
	
	/**
	 * Method to create a formatted string containing the class data.
	 * 
	 * @return formatted string containing the class data
	 */
	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", l=" + l + ", full=" + full + ", rested="
				+ rested + "]";
	}

}// end class
