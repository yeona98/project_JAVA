package java07;

import java.util.Scanner;

public class ex07_03_�迭���ִ��ּұ��ϱ�2 {
	
	public static void sortselect(int array[], int size) {
		for(int i = 0; i < size - 1; i = i + 1) {
			for(int j = i + 1; j < size; j = j + 1) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("INPUT: ");
		int[] Numbers = new int [10];
		for(int i = 0; i < Numbers.length; i++) {
			Numbers[i] = keyboard.nextInt();
		}
		
		System.out.println("�迭 ���� ��: " );
		for(int i = 0; i <= Numbers.length; i++) {
			System.out.print(Numbers[i] + " ");
		}
		sortselect(Numbers, Numbers.length);
		
		System.out.println("�迭 ���� ��: ");
		for(int i = 0; i <= Numbers.length; i++) {
			System.out.print(Numbers[i]);
		}
		System.out.println();
	}
	
	

}
