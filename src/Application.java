
public class Application {

	public static void main(String[] args) {
		System.out.print("************************************************\n"
				   + " Note:\n"
				   + " eac = empty-argument constructor\n"
				   + " pc = preferred constructor\n"
				   + "************************************************\n");
		
		System.out.print("************************************************\n"
					   + "                 Location Tests\n"
					   + "************************************************\n");
		System.out.println("Testing empty-argument constructor (eac):");
		Location eac = new Location();
		System.out.println("eac.toString = " + eac.toString() + "\n");
		
		System.out.println("Testing preferred constructor (pc):");
		Location pc = new Location(2,3);
		System.out.println("pc.toString = " + pc.toString() + "\n");
		
		System.out.println("Testing update method:");
		pc.update(4, 5);
		System.out.println("pc.toString = " 
				+ pc.toString() + "\n");
		
		System.out.println("Testing getCoordinates method:");
		int [] coord = pc.getCoordinates();
		System.out.println("xCoord = " + coord[0]);
		System.out.println("yCoord = " + coord[1] + "\n");
		
		System.out.println("Testing Getters and Setters:");
		pc.setxCoord(10);
		pc.setyCoord(10);
		System.out.println("xCoord = " + pc.getxCoord());
		System.out.println("yCoord = " + pc.getyCoord() + "\n");
		
		System.out.println("Testing InvalidCoordinateException for xCoord:");
		pc.update(-1,2);
		System.out.println("Testing InvalidCoordinateException for yCoord:");
		pc.update(1,-2);
		System.out.println();
		
		System.out.print("************************************************\n"
				       + "                  Animal Tests\n"
				       + "************************************************\n");
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
		pcG.fly(new Location(8,8));
		System.out.println("pcG.toString = \n " + pcG.toString() + "\n");
		
		System.out.println("Testing walk method:");
		// TODO Auto-generated method stub
		System.out.println();
		
		System.out.println("Testing eat method:");
		pcG.setFull(false);
		System.out.println("pcG.isFull() = " + pcG.isFull());
		while(!pcG.isFull()) {
			pcG.eat();
		}
		System.out.println("pcG.isFull() = " + pcG.isFull() + "\n");
		
		System.out.println("Testing sleep method:");
		pcG.setRested(false);
		System.out.println("pcG.isRested() = " + pcG.isRested());
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
		System.out.println("pcG.getSimID() = " + pcG.getSimID() 
			 + "\npcG.getL() = " + pcG.getL()
			 + "\npcG.isFull() = " + pcG.isFull()
			 + "\npcG.isRested() = " + pcG.isRested()
			 + "\npcG.getWingSpan() = " + pcG.getWingSpan()
			 + "\n");
		
		System.out.println("Testing InvalidWingSpanException:");
		pcG.setWingSpan(5.0);
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
		// TODO Auto-generated method stub
		System.out.println();
		
		System.out.println("Testing walk method:");
		// TODO Auto-generated method stub
		System.out.println();
		
		System.out.println("Testing eat method:");
		pcBB.setFull(false);
		System.out.println("pcBB.isFull() = " + pcBB.isFull());
		while(!pcBB.isFull()) {
			pcBB.eat();
		}
		System.out.println("pcBB.isFull() = " + pcBB.isFull() + "\n");
		
		System.out.println("Testing sleep method:");
		pcBB.setRested(false);
		System.out.println("pcBB.isRested() = " + pcBB.isRested());
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
		System.out.println("pcBB.getSimID() = " + pcBB.getSimID() 
			 + "\npcBB.getL() = " + pcBB.getL()
			 + "\npcBB.isFull() = " + pcBB.isFull()
			 + "\npcBB.isRested() = " + pcBB.isRested()
			 + "\npcBB.getSubSpecies() = " + pcBB.getSubSpecies()
			 + "\n");
		
		System.out.println("Testing InvalidSubspeciesException:");
		pcBB.setSubSpecies("Trout");
		System.out.println();
		
		
		
		
		
		
	}// end main

}// end class
