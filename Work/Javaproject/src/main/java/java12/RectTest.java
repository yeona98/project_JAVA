package java12;

import java.util.Scanner;

public class RectTest {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Rect myRect = new Rect();
		
		System.out.print("가로: ");
		int width = keyboard.nextInt();
		System.out.print("세로: ");
		int height = keyboard.nextInt();
		
		System.out.println("-------------------");
		
		System.out.println("사각형의 넓이: " + myRect.area(width, height));
		System.out.println("사각형의 둘레: " + myRect.perimeter(width, height));
	}

}
