package oopPractice;

public class CircleTest {

	public static void main(String... args) {
		// Declare and allocate an instance of class Circle called c1
		// with default radius and color
		Circle c1 = new Circle();
		printCircleStats(c1);
		// Declare and allocate an instance of class circle called c2
		// with the given radius and default color
		Circle c2 = new Circle(2.0);
		printCircleStats(c2);
		
		Circle c3 = new Circle(1.5, "yellow");
		printCircleStats(c3);
		
		Circle c4 =  new Circle();
		c4.setColor("pink");
		c4.setRadius(2.89);
		printCircleStats(c4);
	}
	
	static void printCircleStats(Circle circle){
		// Use the dot operator to invoke methods of instance circle.
		System.out.println("The circle has radius of " + circle.getRadius() + " and area of " + circle.getArea() + " and it's color is "
				+ circle.getColor());
		System.out.println(circle.toString());
		System.out.println(circle);
		System.out.println("Operator '+' calls implicit toString:"+ circle);
	}

}
