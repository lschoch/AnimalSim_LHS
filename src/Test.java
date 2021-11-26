
public class Test {
	public static void main(String [] args) {
		Location l = new Location(1,3);
		System.out.println(l.toString());
//		l.update(-1, 3);
//		System.out.println(l.toString());
//		l.update(2, -3);
//		System.out.println(l.toString());
		
		Goldfinch gf = new Goldfinch(12, new Location(2,3), 5.1);
		System.out.println(gf.toString());
	}
	
	
}
