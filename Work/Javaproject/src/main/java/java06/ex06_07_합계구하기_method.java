package java06;

import java.util.Scanner;

public class ex06_07_�հ豸�ϱ�_method {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���۰��� �Է��ϼ���. ");
		int numstart = keyboard.nextInt();
		System.out.print("���ᰪ�� �Է��ϼ���. ");
		int numfinish = keyboard.nextInt();
		
		method2(numstart, numfinish);
			
	}
	
	public static int method1(int numstart, int numfinish) {
		if(numstart > numfinish) {
			int temp = numstart;
			numstart = numfinish;
			numfinish = temp;
		}
		
		int sum = 0;
		for(int i = numstart; i <= numfinish; i++) {
			sum = sum + i;
		}
		return sum;		
	}
	
	public static void method2(int numstart, int numfinish) {
		if(numstart > numfinish) {
			System.out.println(numfinish + "���� " + numstart + "������ �հ�� " + method1(numstart, numfinish) + "�Դϴ�");
		}
		else {
			System.out.println(numstart + "���� " + numfinish + "������ �հ�� " + method1(numstart, numfinish) + "�Դϴ�");
		}
		return;
	}

}
