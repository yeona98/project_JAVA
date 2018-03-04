package java14.st5shape;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public double area() {
		return width * height;
	}
	
	public void draw() {
		System.out.println();
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
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}


}
