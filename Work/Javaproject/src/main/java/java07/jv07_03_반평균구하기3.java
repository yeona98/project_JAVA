package java07;

import java.util.Scanner;

public class jv07_03_����ձ��ϱ�3 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("�л����� �Է��Ͻÿ� : ");
		int numstudent = keyboard.nextInt();
		int [] grade = new int[numstudent];
		
		for(int i = 0; i < grade.length; i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			grade[i] = keyboard.nextInt();
		}
		int sum = 0;
		
		for(int i = 0; i < grade.length; i++) {
			sum = sum + grade[i];
		}
		
		System.out.println("�հ�� : " + sum);
		
		System.out.println("����� : " + sum/numstudent);
		
		
		
		
	}

}
