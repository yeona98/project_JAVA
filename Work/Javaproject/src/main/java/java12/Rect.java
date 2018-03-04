package java12;

public class Rect {
	public Rect() {
		super();
	}
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	private int width;
	private int height;
	
	public double area(int width, int height) {
		return ((double)width * height);
	}
	public double perimeter(int width, int height) {
		return (double)(2 * (width + height));
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
	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}

}
