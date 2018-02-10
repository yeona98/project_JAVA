package java03;

import java.util.Scanner;

	public class jv03_05_삼항연산자 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("첫번째수를 입력하세요. ");
		int num1 = keyboard.nextInt();
		
		System.out.print("두번째수를 입력하세요. ");
		int num2 = keyboard.nextInt();
		
		System.out.print("세번째수를 입력하세요. ");
		int num3 = keyboard.nextInt();
		
		int max_value = (num1 > num2) ?num1:num2;
		if(num1 > num2 && num1 >num3) {
			System.out.println("입력 받은 수 중 가장 큰 수는 " + num1 + "입니다.");
		}
		else if(num2 > num3) {
			System.out.println("입력 받은 수 중 가장 큰 수는 " + num2 + "입니다.");
		}
		else {
			System.out.println("입력 받은 수 중 가장 큰 수는 " + num3 + "입니다.");
		}
	}

}
