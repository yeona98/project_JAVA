package java06;

import java.util.Scanner;

public class ex06_04_사칙연산메서드 {
	
	public static int Add(int firstnum, int secondnum) {
		int add = firstnum + secondnum;
		return add;
	}
	
	public static int Minus(int firstnum, int secondnum) {
		int min = firstnum - secondnum;
		return min;
	}
	
	public static int Mul(int firstnum, int secondnum) {
		int mul = firstnum * secondnum;
		return mul;
	}
	
	public static double Div(double firstnum, double secondnum) {
		double div = (double)(firstnum / secondnum);
		return div;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("First num : ");
		int num1 = keyboard.nextInt();
		System.out.print("Second num : ");
		int num2 = keyboard.nextInt();
		
		int Add = Add(num1, num2);
		int Minus = Minus(num1, num2);
		int Mul = Mul(num1, num2);
		double Div = Div(num1, num2);
		
		System.out.println("Add : " + Add);
		System.out.println("Minus : " + Minus);
		System.out.println("Mul : " + Mul);
		System.out.printf("Div : %f", Div);
	}

}
