package java07;

import java.util.Scanner;

public class ex07_01_�����迭 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("������� �ϴ� �迭 ũ�⸦ �Է��Ͻÿ� : ");
		int length = keyboard.nextInt();
		
		int [] arr = new int[length];
		
		for(int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
