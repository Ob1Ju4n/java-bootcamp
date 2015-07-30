package inheritance;

public class Circle {

	private double radius;
	private String color;
	
	public Circle(){
		this.radius = 1.0;
		this.color = "red";
	}
	
	public Circle(double radius) {
		this();
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public double getArea(){
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
}
