package java00;

import java.util.Scanner;

public class jv00_02_1부터10까지의합계산 {
	
	
	static int rec_func(int n) {
			int sum = 0;
			for(int i=1; i<=n; i++) {
				sum = sum + i;
			}
			
			return sum;
		}
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = keyboard.nextInt();
		
		int sum;
		sum = rec_func(num);
		
		System.out.println(sum);
	}

}
