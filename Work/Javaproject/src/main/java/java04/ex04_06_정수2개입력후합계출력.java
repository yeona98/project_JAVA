package java04;

import java.util.Scanner;

public class ex04_06_����2���Է����հ���� {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. ");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		int sum = 0;
		
		
		for(int i = num1; i <= num2; i = i + 1) {
			sum = sum + i;
			if(i == num1) {
				System.out.print(i);
			}
			else {
				System.out.print("+" + i);
			}
		}
		System.out.println(" = " + sum);
	}

}
