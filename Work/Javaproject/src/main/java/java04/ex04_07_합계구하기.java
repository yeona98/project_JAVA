package java04;

import java.util.Scanner;

public class ex04_07_합계구하기 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("시작값을 입력하세요. ");
		int num1 = keyboard.nextInt();
		System.out.print("종료값을 입력하세요. ");
		int num2 = keyboard.nextInt();
		int sum = 0;
		
		
		for(int i = num1; i <= num2; i = i + 1) {
			sum = sum + i;
		}
		System.out.println( num1 + "부터 " + num2 + "까지의 합계는 "  + sum +"입니다");
		
		System.out.print("시작값을 입력하세요. ");
		int num3 = keyboard.nextInt();
		System.out.print("종료값을 입력하세요. ");
		int num4 = keyboard.nextInt();
		int sum2 = 0;
		
		
		for(int i = num4; i <= num3; i = i + 1) {
			sum2 = sum2 + i;
		}
		System.out.println( num4 + "부터 " + num3 + "까지의 합계는 "  + sum2 +"입니다");
	}

}
