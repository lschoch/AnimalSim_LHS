import java.util.ArrayList;

/**
 * Class to test the classes and methods of this package.
 * 
 * @author lschoch
 * @version 1.0 CS-131-ON AnimalSim
 */
public class Application {
	/**
	 * The main method. Instantiates all classes and tests all methods of each
	 * class. Creates a generic ArrayList object that can hold any kind of 
	 * animal,instantiates it with two animals of each type and iterates through 
	 * the list to print class data for each element.
	 * 
	 * @param args this method does not use command line arguments
	 */
	public static void main(String[] args) {
		System.out.print("************************************************\n"
				       + " Note:\n"
				       + " eac = empty-argument constructor\n"
				       + " pc = preferred constructor\n\n"
				       + " For direction:\n"
				       + "  1 means move right\n"
				       + " -1 means move left\n"
				       + "  2 means move up\n"
				       + " -2 means move down\n"
				       + "************************************************\n\n");
		
		System.out.print("************************************************\n"
					   + "                 Location Tests\n"
					   + "************************************************\n");
		System.out.println("Testing empty-argument constructor (eacL):");
		Location eacL = new Location();
		System.out.println("eacL.toString = " + eacL.toString() + "\n");
		
		System.out.println("Testing preferred constructor (pcL):");
		Location pcL = new Location(2,3);
		System.out.println("pcL.toString = " + pcL.toString() + "\n");
		
		System.out.println("Testing update method:");
		pcL.update(4, 5);
		System.out.println("pcL.update(4, 5) >  pcL.toString = " 
				+ pcL.toString() + "\n");
		
		System.out.println("Testing getCoordinates method:");
		System.out.println("pcL.getCoordinates()[0] = " + pcL.getCoordinates()[0]);
		System.out.println("pcL.getCoordinates()[1] = " + pcL.getCoordinates()[1] + "\n");
		
		System.out.println("Testing Getters and Setters:");
		pcL.setxCoord(10);
		pcL.setyCoord(10);
		System.out.println("pcL.setxCoord(10) > pcL.getxCoord = " + pcL.getxCoord());
		System.out.println("pcL.setyCoord(10) > pcL.getyCoord = " + pcL.getyCoord() + "\n");
		
		System.out.println("Testing InvalidCoordinateException for xCoord:");
		pcL.update(-1,2);
		System.out.println("Testing InvalidCoordinateException for yCoord:");
		pcL.update(1,-2);
		System.out.println();
		
		System.out.print("************************************************\n"
				       + "                  Animal Tests\n"
				       + "************************************************\n");
//		Uncomment the line following this sentence to see the compiler error 
//		that arises from trying to instantiate this abstract class.
//		Animal a = new Animal();
		System.out.println("Attempts to instantiate this abstract class result "
			+ "in a compiler error:\n \"cannot instantiate the type Animal\".");
		System.out.println();
		
		System.out.print("************************************************\n"
			           + "                 Goldfinch Tests\n"
			           + "************************************************\n");
		System.out.println("Testing empty-argument constructor (eacG):");
		Goldfinch eacG = new Goldfinch();
		System.out.println("eacG.toString = \n " 
				+ eacG.toString() + "\n");
		
		System.out.println("Testing preferred constructor (pcG):");
		Goldfinch pcG = new Goldfinch(10, new Location(5,5), 6.0);
		System.out.println("pcG.toString = \n " + pcG.toString() + "\n");
		
		System.out.println("Testing fly method:");
		System.out.println("Starting location\t\t" + pcG.getL().toString());
		pcG.fly(new Location(8,8));
		System.out.println("pcG.fly(new Location(8,8))\t" + pcG.getL().toString() + "\n");
		
		System.out.println("Testing walk method:");
		System.out.println("Starting location\t\t" + pcG.getL().toString());
		pcG.walk(-2);
		System.out.println("pcG.walk(-2) = down 1 unit\t" + pcG.getL().toString());
		pcG.walk( 2);
		System.out.println("pcG.walk( 2) = up 1 unit\t" + pcG.getL().toString());
		pcG.walk(-1);
		System.out.println("pcG.walk(-1) = left 1 unit\t" + pcG.getL().toString());
		pcG.walk(1);
		System.out.println("pcG.walk( 1) = right 1 unit\t" + pcG.getL().toString());
		
		pcG.getL().update(0, 0);
		System.out.println("Starting location\t\t" + pcG.getL().toString());
		pcG.walk(-2);
		System.out.println("pcG.walk(-2) = down 1 unit\t" + pcG.getL().toString()
				+ " (Negative coordinates not allowed, yCoord remains at 0)");
		pcG.walk( 2);
		System.out.println("pcG.walk( 2) = up 1 unit\t" + pcG.getL().toString());
		pcG.walk(-1);
		System.out.println("pcG.walk(-1) = left 1 unit\t" + pcG.getL().toString()
				+ " (Negative coordinates not allowed, xCoord remains at 0)");
		pcG.walk(1);
		System.out.println("pcG.walk( 1) = right 1 unit\t" + pcG.getL().toString());
		System.out.println();
		
		System.out.println("Testing eat method:");
		// Set full to false
		pcG.setFull(false);
		System.out.println("pcG.isFull() = " + pcG.isFull());
		// Repeat setting full until it is true
		while(!pcG.isFull()) {
			pcG.eat();
		}
		System.out.println("pcG.isFull() = " + pcG.isFull() + "\n");
		
		System.out.println("Testing sleep method:");
		// Set rested to false
		pcG.setRested(false);
		System.out.println("pcG.isRested() = " + pcG.isRested());
		// Repeat setting rested until it is true
		while(!pcG.isRested()) {
			pcG.sleep();
		}
		System.out.println("pcG.isRested() = " + pcG.isRested() + "\n");
		
		System.out.println("Testing Getters and Setters:");
		pcG.setSimID(200);
		pcG.setL(new Location(200,200));
		pcG.setFull(false);
		pcG.setRested(false);
		pcG.setWingSpan(8.0);
		System.out.println("pcG.setSimID(200) > pcG.getSimID() = " + pcG.getSimID() 
			 + "\npcG.setL(new Location(200,200)) > pcG.getL() = " + pcG.getL()
			 + "\npcG.setFull(false) > pcG.isFull() = " + pcG.isFull()
			 + "\npcG.setRested(false) > pcG.isRested() = " + pcG.isRested()
			 + "\npcG.setWingSpan(8.0) > pcG.getWingSpan() = " + pcG.getWingSpan()
			 + "\n");
		
		System.out.println("Testing InvalidWingSpanException:");
		pcG.setWingSpan(5.0);
		System.out.println();
		
		System.out.println("Testing InvalidSimIDException:");
		pcG.setSimID(-1);
		Goldfinch g = new Goldfinch(-2, new Location(1, 3), 5.1);
		System.out.println();
		
		System.out.print("************************************************\n"
		               + "                 BrownBear Tests\n"
		               + "************************************************\n");
		System.out.println("Testing empty-argument constructor (eacBB):");
		BrownBear eacBB = new BrownBear();
		System.out.println("eacBB.toString = \n " 
				+ eacBB.toString() + "\n");
		
		System.out.println("Testing preferred constructor (pcBB):");
		BrownBear pcBB = new BrownBear(10, new Location(5,5), "Kodiak");
		System.out.println("pcBB.toString = \n " + pcBB.toString() + "\n");
		
		System.out.println("Testing swim method:");
		System.out.println("Starting location\t\t" + pcBB.getL().toString());
		pcBB.swim(-2);
		System.out.println("pcBB.swim(-2) = down 2 units\t" + pcBB.getL().toString());
		pcBB.swim( 2);
		System.out.println("pcBB.swim( 2) = up 2 units\t" + pcBB.getL().toString());
		pcBB.swim(-1);
		System.out.println("pcBB.swim(-1) = left 2 units\t" + pcBB.getL().toString());
		pcBB.swim(1);
		System.out.println("pcBB.swim( 1) = right 2 units\t" + pcBB.getL().toString());
		
		pcBB.getL().update(0, 0);
		System.out.println("Starting location\t\t" + pcBB.getL().toString());
		pcBB.swim(-2);
		System.out.println("pcBB.swim(-2) = down 2 units\t" + pcBB.getL().toString()
				+ " (Negative coordinates not allowed, yCoord remains at 0)");
		pcBB.swim( 2);
		System.out.println("pcBB.swim( 2) = up 2 units\t" + pcBB.getL().toString());
		pcBB.swim(-1);
		System.out.println("pcBB.swim(-1) = left 2 units\t" + pcBB.getL().toString()
				+ " (Negative coordinates not allowed, xCoord remains at 0)");
		pcBB.swim(1);
		System.out.println("pcBB.swim( 1) = right 2 units\t" + pcBB.getL().toString());
		System.out.println();
		
		System.out.println("Testing walk method:");
		pcBB.getL().update(3, 3);
		System.out.println("Starting location\t\t" + pcBB.getL().toString());
		pcBB.walk(-2);
		System.out.println("pcBB.walk(-2) = down 3 units\t" + pcBB.getL().toString());
		pcBB.walk( 2);
		System.out.println("pcBB.walk( 2) = up 3 units\t" + pcBB.getL().toString());
		pcBB.walk(-1);
		System.out.println("pcBB.walk(-1) = left 3 units\t" + pcBB.getL().toString());
		pcBB.walk(1);
		System.out.println("pcBB.walk( 1) = right 3 units\t" + pcBB.getL().toString());
		
		pcBB.getL().update(0, 0);
		System.out.println("Starting location\t\t" + pcBB.getL().toString());
		pcBB.walk(-2);
		System.out.println("pcBB.walk(-2) = down 3 units\t" + pcBB.getL().toString()
				+ " (Negative coordinates not allowed, yCoord remains at 0)");
		pcBB.walk( 2);
		System.out.println("pcBB.walk( 2) = up 3 units\t" + pcBB.getL().toString());
		pcBB.walk(-1);
		System.out.println("pcBB.walk(-1) = left 3 units\t" + pcBB.getL().toString()
				+ " (Negative coordinates not allowed, xCoord remains at 0)");
		pcBB.walk(1);
		System.out.println("pcBB.walk( 1) = right 3 units\t" + pcBB.getL().toString());
		System.out.println();
		
		System.out.println("Testing eat method:");
		// Set full to false
		pcBB.setFull(false);
		System.out.println("pcBB.isFull() = " + pcBB.isFull());
		// Repeat setting full until it is true
		while(!pcBB.isFull()) {
			pcBB.eat();
		}
		System.out.println("pcBB.isFull() = " + pcBB.isFull() + "\n");
		
		System.out.println("Testing sleep method:");
		// Set rested to false
		pcBB.setRested(false);
		System.out.println("pcBB.isRested() = " + pcBB.isRested());
		// Repeat setting rested until it's true
		while(!pcBB.isRested()) {
			pcBB.sleep();
		}
		System.out.println("pcBB.isRested() = " + pcBB.isRested() + "\n");
		
		System.out.println("Testing Getters and Setters:");
		pcBB.setSimID(300);
		pcBB.setL(new Location(300,300));
		pcBB.setFull(false);
		pcBB.setRested(false);
		pcBB.setSubSpecies("Grizzly");
		System.out.println("pcBB.setSimID(300) > pcBB.getSimID() = " + pcBB.getSimID() 
			 + "\npcBB.setL(new Location(300,300)) pcBB.getL() = " + pcBB.getL()
			 + "\npcBB.setFull(false) > pcBB.isFull() = " + pcBB.isFull()
			 + "\npcBB.setRested(false) > pcBB.isRested() = " + pcBB.isRested()
			 + "\npcBB.setSubSpecies(\"Grizzly\") > pcBB.getSubSpecies() = " + pcBB.getSubSpecies()
			 + "\n");
		
		System.out.println("Testing InvalidSubspeciesException:");
		pcBB.setSubSpecies("Trout");
		System.out.println();
		
		System.out.println("Testing InvalidSimIDException:");
		pcBB.setSimID(-1);
		BrownBear brBear = new BrownBear(-2, new Location(1, 3), "Grizzly");
		System.out.println();
		
//		*********************************************
//		 Generics Tests
//		*********************************************
		
		System.out.print("************************************************\n"
	                   + "                 Generics Tests\n"
	                   + "************************************************\n");
		ArrayList <Animal> animalList = new ArrayList<Animal>(4);
		Goldfinch gf1 = new Goldfinch(10, new Location(10,10), 5.5);
		Goldfinch gf2 = new Goldfinch(20, new Location(20,20), 5.6);
		BrownBear bb1 = new BrownBear(30, new Location(30,30), "Alaskan");
		BrownBear bb2 = new BrownBear(40, new Location(40,40), "Grizzly");
		animalList.add(gf1);
		animalList.add(gf2);
		animalList.add(bb1);
		animalList.add(bb2);
		
		for (Animal a : animalList) {
			System.out.println(a.toString());
		}
		
	}// end main

}// end class
