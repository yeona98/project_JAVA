package java11;

import java.util.Scanner;

public class ReckTest {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("����: ");
		int w = keyboard.nextInt();
		System.out.print("����: ");
		int h = keyboard.nextInt();
		
		Rect myReck= new Rect(w, h);
		
		double a = myReck.area();
		double p = myReck.perimeter();
		System.out.println("�簢���� ����: " + a);
		System.out.println("�簢���� �ѷ�: " + p);
	}

}
