
public class Application {

	public static void main(String[] args) {
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

	}// end main

}// end class
