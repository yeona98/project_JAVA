package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기3 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("학생수를 입력하시오 : ");
		int numstudent = keyboard.nextInt();
		int [] grade = new int[numstudent];
		
		for(int i = 0; i < grade.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			grade[i] = keyboard.nextInt();
		}
		int sum = 0;
		
		for(int i = 0; i < grade.length; i++) {
			sum = sum + grade[i];
		}
		
		System.out.println("합계는 : " + sum);
		
		System.out.println("평균은 : " + sum/numstudent);
		
		
		
		
	}

}
