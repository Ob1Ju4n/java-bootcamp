package composition;

public class Line {

	private Point start;
	private Point end;
	
	public Line(Point start, Point end) {
		
		super();
		this.start = start;
		this.end = end;
		
	}
	
	public Line(int x1, int y1, int x2, int y2){
		
		this.start = new Point(x1, y1);
		this.end = new Point(x2, y2);
		
	}

	
	public double getLength(){
		
		double x = Math.pow(this.end.getY()-this.start.getY(), 2);
		double y = Math.pow(this.end.getX()-this.start.getX(), 2);
		return Math.sqrt(y + x);
		
	}
	
	public double getGradient(){
		
		double x = this.end.getY()-this.start.getY();
		double y = this.end.getX()-this.start.getX();
		return Math.atan2(y, x);
		
	}
	
	
	
	@Override
	public String toString() {
		return "Line [start=" + start + ", end=" + end + "]";
	}

	//Getters & Setters
	public Point getStart() {
		return start;
	}

	public Point getEnd() {
		return end;
	}
	
	
}
