package java00;

import java.util.Scanner;

public class jv00_02_1����10�������հ�� {
	
	
	static int rec_func(int n) {
			int sum = 0;
			for(int i=1; i<=n; i++) {
				sum = sum + i;
			}
			
			return sum;
		}
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = keyboard.nextInt();
		
		int sum;
		sum = rec_func(num);
		
		System.out.println(sum);
	}

}
