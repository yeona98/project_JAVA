package java02;

import java.util.Scanner;

public class ex02_01_�������ϱ� {
	
	public static void main(String[] args) {
	
	int w = 10;
	int h = 5;
	double area = (double)w * h;
	double perimeter = (double)2 * (w + h);
	
	System.out.print("�簢���� ����: ");
	System.out.println(area);
	System.out.print("�簢���� �ѷ�: ");
	System.out.println(perimeter);
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("������ �Է��ϼ��� : ");
	w = keyboard.nextInt();
	h = keyboard.nextInt();
	area = (double)w * h;
	perimeter = (double)2 * (w + h);
	
	
	System.out.print("�簢���� ����: ");
	System.out.println(area);
	System.out.print("�簢���� �ѷ�: ");
	System.out.println(perimeter);
	}
	
}
