package java00;

import java.util.Scanner;

public class ex06_07_�հ豸�ϱ�_method {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("���۰��� �Է��ϼ���. ");
		int num1 = keyboard.nextInt();
		System.out.print("���ᰪ�� �Է��ϼ���. ");
		int num2 = keyboard.nextInt();
		int sum = 0;
		
		
		
		Print(num1, num2, Add(num1, num2));
		
		// Swap
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.print("���۰��� �Է��ϼ���. ");
		num2 = keyboard.nextInt();
		System.out.print("���ᰪ�� �Է��ϼ���. ");
		num1 = keyboard.nextInt();
		
		Print(num1, num2, Add(num1, num2));
	}
	
	public static int Add(int num1, int num2) {
		int sum = 0;
		for(int i = num1; i <= num2; i = i + 1) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static void Print(int num1, int num2, int sum) {
		System.out.println( num1 + "���� " + num2 + "������ �հ�� "  + sum +"�Դϴ�");
		
	}

}
