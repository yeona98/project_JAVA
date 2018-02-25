package java11;

import java.util.Scanner;

public class ReckTest {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("가로: ");
		int w = keyboard.nextInt();
		System.out.print("세로: ");
		int h = keyboard.nextInt();
		
		Rect myReck= new Rect(w, h);
		
		double a = myReck.area();
		double p = myReck.perimeter();
		System.out.println("사각형의 넓이: " + a);
		System.out.println("사각형의 둘레: " + p);
	}

}
