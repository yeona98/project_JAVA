package java04;

import java.util.Scanner;

public class jv04_12_삼각형출력 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Choice : ");
		int choice = keyboard.nextInt();
		
		switch(choice) {
		case 1:
			for(int i = 1; i < 10; i = i + 1) {
				for(int j = 1; j <= 10; j = j + 1) {
					System.out.print("*");
				}
				System.out.println();
			} break;
		case 2:
			for(int i = 1; i < 10; i = i + 1) {
				for(int j = 1; j <= i; j = j + 1) {
					System.out.print("*");
				}
				System.out.println();
			} break;
		case 3:
			for(int i = 1; i < 10; i = i + 1) {
				for(int j = 10; i <= j; j = j - 1) {
					System.out.print("*");
				}
				System.out.println();
			} break;
		}
	}
}
