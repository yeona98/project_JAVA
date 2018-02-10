package java03;

import java.util.Scanner;

public class jv03_03_ÁßÃ¸ifelse {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Grade: ");
		int grade = keyboard.nextInt();
		
		System.out.print("ÇÐÁ¡ : ");
		if (grade >= 60) {
			if (grade >= 70) {
				if (grade >= 80) {
					if (grade >= 90) {
						System.out.println("A");
					}
					else {
					System.out.println("B");
					}
				}
				else {
				System.out.println("C");
				}
			}
			else {
				System.out.println("D");
			}
		}
		else {
			System.out.println("F");
		}
	}

}
