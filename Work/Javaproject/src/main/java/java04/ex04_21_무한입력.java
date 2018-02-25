package java04;

import java.util.Scanner;

public class ex04_21_무한입력 {
	
	public static void main(String[] args) {
		for( ; true; ) {
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("정수를 입력하세요 : ");
			int num = keyboard.nextInt();
			
			if(num < 0) {
				System.out.println("정상 종료합니다.");
				break;
			}
			
			System.out.println("입력한 값은 " + num + "입니다.");
			
			
			
			
			
		}
	}

}
