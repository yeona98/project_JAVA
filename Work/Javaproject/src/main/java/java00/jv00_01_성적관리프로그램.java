package java00;

import java.util.Scanner;

public class jv00_01_성적관리프로그램 {
	
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
		
		System.out.print("# 세 과목의 점수 입력 : ");
		int kor = keyboard.nextInt();
		int eng = keyboard.nextInt();
		int mat = keyboard.nextInt();
		
		// void print_title(void);`
		
		System.out.println();
		System.out.println("     =====< 성적표 >=====");
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("      국어       영어      수학       총점       평균      ");
		System.out.println("------------------------------");
		
		int total = total(kor, eng, mat);
		double average = average(total);
		// void print_title = print_title(void);
		System.out.printf("   %d   %d   %d   %d   %.1f   ", kor, eng, mat, total, average);
	
		
		
		
		
	}

}
