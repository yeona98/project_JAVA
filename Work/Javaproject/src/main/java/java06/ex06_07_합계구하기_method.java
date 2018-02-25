package java06;

import java.util.Scanner;

public class ex06_07_합계구하기_method {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("시작값을 입력하세요. ");
		int numstart = keyboard.nextInt();
		System.out.print("종료값을 입력하세요. ");
		int numfinish = keyboard.nextInt();
		
		method2(numstart, numfinish);
			
	}
	
	public static int method1(int numstart, int numfinish) {
		if(numstart > numfinish) {
			int temp = numstart;
			numstart = numfinish;
			numfinish = temp;
		}
		
		int sum = 0;
		for(int i = numstart; i <= numfinish; i++) {
			sum = sum + i;
		}
		return sum;		
	}
	
	public static void method2(int numstart, int numfinish) {
		if(numstart > numfinish) {
			System.out.println(numfinish + "부터 " + numstart + "까지의 합계는 " + method1(numstart, numfinish) + "입니다");
		}
		else {
			System.out.println(numstart + "부터 " + numfinish + "까지의 합계는 " + method1(numstart, numfinish) + "입니다");
		}
		return;
	}

}
