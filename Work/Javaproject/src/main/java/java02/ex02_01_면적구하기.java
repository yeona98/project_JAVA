package java02;

import java.util.Scanner;

public class ex02_01_면적구하기 {
	
	public static void main(String[] args) {
	
	int w = 10;
	int h = 5;
	double area = (double)w * h;
	double perimeter = (double)2 * (w + h);
	
	System.out.print("사각형의 넓이: ");
	System.out.println(area);
	System.out.print("사각형의 둘레: ");
	System.out.println(perimeter);
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("정수를 입력하세요 : ");
	w = keyboard.nextInt();
	h = keyboard.nextInt();
	area = (double)w * h;
	perimeter = (double)2 * (w + h);
	
	
	System.out.print("사각형의 넓이: ");
	System.out.println(area);
	System.out.print("사각형의 둘레: ");
	System.out.println(perimeter);
	}
	
}
