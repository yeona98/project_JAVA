package java06;

import java.util.Scanner;

public class ex06_03_isNumber {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String str = keyboard.nextLine();
		
		System.out.println(isNumber(str));
	}
	
	public static boolean isNumber(String str) {
		
		boolean result = false;
		
		if(str == null || str.equals("")) {
			result = false;
		}
		else {
			result = true;
		}
				
		return result;
	}

}
