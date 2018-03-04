package java14.st5shape2;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public double area() {
		return 0.0;
	}
	public void draw() {
		return;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Rectangle() {
		super();
		System.out.println("Rectangle »ý¼ºÀÚ");
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle(int x, int y, String color, int width, int height) {
		super(x, y, color);
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", toString()=" + super.toString() + "]";
	}
	
}
