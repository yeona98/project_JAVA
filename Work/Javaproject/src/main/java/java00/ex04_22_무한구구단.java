package java00;

import java.util.Scanner;

public class ex04_22_���ѱ����� {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		for(;true;) {
			System.out.print("���۴� : ");
			int start = keyboard.nextInt();
			System.out.print("����� : ");
			int finish = keyboard.nextInt();
			
			if(start > finish) {
				int temp = start;
				start = finish;
				finish = temp;
			}
			
			if(start == 0 || finish == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		
			for(int i = start; i <= finish;  i = i + 1) {
				for(int j = 1; j <= 9; j = j + 1) {
					if(j < 9) {
						System.out.print(i + "*" + j + "=" + (i*j) + " ");
					}
					else {
						System.out.println(i + "*" + j + "=" + (i*j));
					}
				}
			
			}
			
			
		}
	}

}
