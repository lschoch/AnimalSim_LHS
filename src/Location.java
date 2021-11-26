
/**
 * Class to encapsulate a point on a simulation map.
 * 
 * @author lschoch
 * @version 1.0 CS-131-ON AnimalSim
 */
public class Location {
	// The x coordinate of the point
	private int xCoord;
	// The y coordinate of the point
	private int yCoord;

	InvalidCoordinateException invalCoordEx = new InvalidCoordinateException("Negative coordinates not allowed.");

	/**
	 * Empty-argument constructor of the Location object. Sets both coordinates to
	 * zero.
	 */
	public Location() {
		xCoord = 0;
		yCoord = 0;
	}// end empty-argument constructor

	/**
	 * This constructor builds a Location objection with the specified parameters.
	 * Catches invalid coordinates.
	 * 
	 * @param x the x coordinate of the object
	 * @param y the y coordinate of the object
	 */
	public Location(int x, int y) {
		try {
			if (x < 0 || y < 0)
				throw (invalCoordEx);
			else {
				xCoord = x;
				yCoord = y;
			}
		} catch (InvalidCoordinateException ice) {
			if (x < 0) {
				System.out.println(x + " -> Invalid X Coordinate. " + ice.getMessage());
				ice.printStackTrace();
			} else if (y < 0) {
				System.out.println(y + " -> Invalid Y Coordinate. " + ice.getMessage());
				ice.printStackTrace();
			}
		}
	}// end preferred constructor

	/**
	 * Method to update the Location object's coordinates to the specified
	 * parameters. Catches invalid coordinates.
	 * 
	 * @param x the x coordinate to be set
	 * @param y the y coordinate to be set
	 */
	public void update(int x, int y) {
		try {
			if (x < 0 || y < 0)
				throw (invalCoordEx);
			else {
				xCoord = x;
				yCoord = y;
			}
		} catch (InvalidCoordinateException ice) {
			if (x < 0) {
				System.out.println(x + " -> Invalid X Coordinate. " + ice.getMessage());
				ice.printStackTrace();
			} else if (y < 0) {
				System.out.println(y + " -> Invalid Y Coordinate. " + ice.getMessage());
				ice.printStackTrace();
			}
		}
	}// end update

	/**
	 * Gets the current coordinates of the Location object.
	 * 
	 * @return integer array containing the x and y coordinates, in that order
	 */
	public int[] getCoordinates() {
		int[] coord = { xCoord, yCoord };
		return coord;
	}// end getCoordinates

	/**
	 * Method to create a formatted string containing the class data.
	 * 
	 * @return formatted string containing the class data
	 */
	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}// end toString

}// end class
