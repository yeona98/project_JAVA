package java04;

import java.util.Scanner;

public class ex04_07_�հ豸�ϱ� {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("���۰��� �Է��ϼ���. ");
		int num1 = keyboard.nextInt();
		System.out.print("���ᰪ�� �Է��ϼ���. ");
		int num2 = keyboard.nextInt();
		int sum = 0;
		
		
		for(int i = num1; i <= num2; i = i + 1) {
			sum = sum + i;
		}
		System.out.println( num1 + "���� " + num2 + "������ �հ�� "  + sum +"�Դϴ�");
		
		// Swap
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.print("���۰��� �Է��ϼ���. ");
		num2 = keyboard.nextInt();
		System.out.print("���ᰪ�� �Է��ϼ���. ");
		num1 = keyboard.nextInt();
		sum = 0;
		
		
		for(int i = num1; i <= num2; i = i + 1) {
			sum = sum + i;
		}
		System.out.println( num1 + "���� " + num2 + "������ �հ�� "  + sum +"�Դϴ�");
	}

}
