package java14.st5shape2;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1, 1, "black", 0, 0);
		Rectangle r2 = new Rectangle(0, 0, "0", 0, 0);
		Rectangle r3 = new Rectangle(0, 0, "0", 100, 200);
		Rectangle r4 = new Rectangle(1, 1, "black", 100, 200);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println(r4.toString());

	}

}
