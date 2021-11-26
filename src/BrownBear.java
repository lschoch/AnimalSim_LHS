
public class BrownBear extends Animal {
	private String subSpecies;
	InvalidSubspeciesException invalSubspeciesEx = 
			new InvalidSubspeciesException("Invalid Subspecies");
	
	public BrownBear() {
		super();
		subSpecies = "Alaskan";
		
	}// end empty-argument constructor
	
	public BrownBear(int simID, Location l, String subSpecies) {
		this.simID = simID;
		this.l = l;
		this.full = false;
		this.rested = true;
		
		try {
			if(subspeciesCheck(subSpecies))
				this.subSpecies = subSpecies;
			else 
				throw(invalSubspeciesEx);
		}
		catch(InvalidSubspeciesException ise) {
			System.out.println(subSpecies + " -> " + ise.getMessage());
			ise.printStackTrace();
		}
		
		
		
		
	}// end preferred constructor
	
	private boolean subspeciesCheck(String ss) {
		String [] stringArray = {"Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"};
		boolean found = false;
	
		for(String x : stringArray){
		    if(x.equals(ss)){
		        found = true;
		        break;
		    }
		}
		return found;
	}// end subspeciesCheck

}// end class
