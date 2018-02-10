package java04;

import java.util.Scanner;

public class ex04_06_정수2개입력후합계출력 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. ");
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
