package java03;

import java.util.Scanner;

public class ex03_02_MaxNumber {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		
		if(x > y) {
			System.out.println("x :" + x);
		}
		else if(x < y) {
			System.out.println("y :" + y);
		}
		else {
			System.out.println("x=y :" + x);
		}
	}

}
