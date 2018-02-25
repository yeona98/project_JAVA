package java04;

import java.util.Scanner;

public class ex04_13_구구단 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("시작 단수를 입력하세요: ");
		int numStart = keyboard.nextInt();
		System.out.print("종료 단수를 입력하세요: ");
		int numFinish = keyboard.nextInt();
		
		if(numStart > numFinish) {
			// Swap
			int temp = numStart;
			numStart = numFinish;
			numFinish = temp;
		}
		
		for(int i = numStart; i <= numFinish;  i = i + 1) {
			for(int j = 1; j <= 9; j = j + 1) {
				if(j < 9) {
					System.out.print(i + "*" + j + "=" + (i*j) + ", ");
				}
				else {
					System.out.println(i + "*" + j + "=" + (i*j) + ", ");
				}
			}
			
		}
	}

}
