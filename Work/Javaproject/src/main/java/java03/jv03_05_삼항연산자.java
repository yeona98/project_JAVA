package java03;

import java.util.Scanner;

	public class jv03_05_���׿����� {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("ù��°���� �Է��ϼ���. ");
		int num1 = keyboard.nextInt();
		
		System.out.print("�ι�°���� �Է��ϼ���. ");
		int num2 = keyboard.nextInt();
		
		System.out.print("����°���� �Է��ϼ���. ");
		int num3 = keyboard.nextInt();
		
		int max_value = (num1 > num2) ?num1:num2;
		if(num1 > num2 && num1 >num3) {
			System.out.println("�Է� ���� �� �� ���� ū ���� " + num1 + "�Դϴ�.");
		}
		else if(num2 > num3) {
			System.out.println("�Է� ���� �� �� ���� ū ���� " + num2 + "�Դϴ�.");
		}
		else {
			System.out.println("�Է� ���� �� �� ���� ū ���� " + num3 + "�Դϴ�.");
		}
	}

}
