package java14.st5shape;

public class Shape {
	private int x;
	private int y;
	
	public void print() {
		System.out.println(toString());
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

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}

	public Shape() {
		super();
	}

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}
