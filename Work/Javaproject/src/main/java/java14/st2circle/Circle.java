package java14.st2circle;

public class Circle {
	public Circle() {
		super();
	}
	public Circle(int redius, Point center) {
		super();
		this.redius = redius;
		this.center = center;
	}
	private int redius;
	private Point center ;
	@Override
	public String toString() {
		return "Circle [redius=" + redius + ", center=" + center + "]";
	}
	public int getRedius() {
		return redius;
	}
	public void setRedius(int redius) {
		this.redius = redius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}

}
