package java01;

import java.util.Scanner;

public class jv01_03_Salary2 {

	public static void main(String[] args) {

		int salary = 0;
		int deposit = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� :");
		salary = keyboard.nextInt();

		deposit = 10 * 12 * salary;

		System.out.println("10�� ������ �����: " + deposit);
	}

}
