package java14.st5shape2;

public class Shape {
	private int x;
	private int y;
	private String color;
	
	public void print() {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Shape() {
		super();
		System.out.println("Shape »ý¼ºÀÚ");
	}

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Shape(int x, int y, String color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

}
