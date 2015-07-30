package composition;

public class LineTest {

	/**
	 * @param args
	 */
	public static void main(String... args){
		
		Line l1 = new Line(2, 6, 6, -3);
		System.out.println(l1);
		
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 5);
		Line l2 = new Line(p1, p2);
		System.out.println(l2);
		
	}
	
}
