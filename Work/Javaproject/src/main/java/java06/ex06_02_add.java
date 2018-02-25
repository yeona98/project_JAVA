package java06;

import java.util.Scanner;

public class ex06_02_add {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		System.out.println(add(a, b));
	}
	
	public static int add(int a, int b) {
		return a + b;
	}

}
