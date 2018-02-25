package java06;

import java.util.Scanner;

public class ex06_05_myprint {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String str = keyboard.next();
		myprint(str);
		
	}
	
	public static void myprint(String str) {
		System.out.println(str);
		return;
	}

}
