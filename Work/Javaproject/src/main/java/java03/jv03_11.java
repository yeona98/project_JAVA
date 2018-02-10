package java03;

import java.util.Scanner;

public class jv03_11 {
	
	public static void main(String[] args) {
		 
		Scanner keyboard = new Scanner(System.in);
		
		int k = keyboard.nextInt();
		
		if(k == 0) {
			System.out.println("A");
		}
		else if(k > 3) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
		
		int size = keyboard.nextInt();
		
		if(size >= 200) {
			System.out.println("large");
		}
		else if(size >= 100 && size <= 200) {
			System.out.println("medium");
		}
		else {
			System.out.println("small");
		}
		
	}

}
