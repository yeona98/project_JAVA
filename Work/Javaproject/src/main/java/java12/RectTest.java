package java12;

import java.util.Scanner;

public class RectTest {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Rect myRect = new Rect();
		
		System.out.print("����: ");
		int width = keyboard.nextInt();
		System.out.print("����: ");
		int height = keyboard.nextInt();
		
		System.out.println("-------------------");
		
		System.out.println("�簢���� ����: " + myRect.area(width, height));
		System.out.println("�簢���� �ѷ�: " + myRect.perimeter(width, height));
	}

}
