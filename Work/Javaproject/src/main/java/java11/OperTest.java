package java11;

import java.util.Scanner;

public class OperTest {
	
	public static void print(String str,int n) {
		System.out.print(str);
		System.out.println(n);
	}
	public static void print(String str,double r) {
		System.out.print(str);
		System.out.printf("%.6f",r);
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("First num : ");
		int firstNum = keyboard.nextInt();
		
		System.out.print("Second num : ");
		int secondNum = keyboard.nextInt();
		
		// setter를 이용
		Oper myOper = new Oper();
		
		myOper.setFirstNum(firstNum);
		myOper.setSecondNum(secondNum);
		
		// 생성자를 이용
		Oper myOper2 = new Oper(firstNum, secondNum);
		
		
		int add = myOper.Add();
		print("Add : ", add);
		int minus = myOper.Minus();
		print("Minus : ", minus);
		int mul = myOper.Mul();
		print("Mul : ", mul);
		double div = myOper.Div();
		print("Div : ", div);
		
	}

}
