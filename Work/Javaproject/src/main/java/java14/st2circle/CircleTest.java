package java14.st2circle;

public class CircleTest {
	
	public static void main(String[] args) {
		
		Point point1 = new Point(25, 78);
		Circle circle1 = new Circle();
		circle1.setRedius(10);
		circle1.setCenter(point1);
		
		//
		System.out.println(circle1.toString());
	}

}
