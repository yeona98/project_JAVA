package java00;

import java.util.Scanner;

public class jv00_01_�����������α׷� {
	
	static int total(int kor, int eng, int mat) {
		
		return kor+eng+mat;
	}
	
	static double average(int tot) {
		
		double average = (double)tot/3;
		return average;
	}
	
	/*
	void print_title(void) {
		
		
		return;
	}
	*/
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("# �� ������ ���� �Է� : ");
		int kor = keyboard.nextInt();
		int eng = keyboard.nextInt();
		int mat = keyboard.nextInt();
		
		// void print_title(void);`
		
		System.out.println();
		System.out.println("     =====< ����ǥ >=====");
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("      ����       ����      ����       ����       ���      ");
		System.out.println("------------------------------");
		
		int total = total(kor, eng, mat);
		double average = average(total);
		// void print_title = print_title(void);
		System.out.printf("   %d   %d   %d   %d   %.1f   ", kor, eng, mat, total, average);
	
		
		
		
		
	}

}
