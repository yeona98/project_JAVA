package java00;

import java.util.Scanner;

public class ex04_22_무한구구단 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		for(;true;) {
			System.out.print("시작단 : ");
			int start = keyboard.nextInt();
			System.out.print("종료단 : ");
			int finish = keyboard.nextInt();
			
			if(start > finish) {
				int temp = start;
				start = finish;
				finish = temp;
			}
			
			if(start == 0 || finish == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		
			for(int i = start; i <= finish;  i = i + 1) {
				for(int j = 1; j <= 9; j = j + 1) {
					if(j < 9) {
						System.out.print(i + "*" + j + "=" + (i*j) + " ");
					}
					else {
						System.out.println(i + "*" + j + "=" + (i*j));
					}
				}
			
			}
			
			
		}
	}

}
