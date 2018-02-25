package java07;

import java.util.Scanner;

public class ex07_01_동적배열 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("만들고자 하는 배열 크기를 입력하시오 : ");
		int length = keyboard.nextInt();
		
		int [] arr = new int[length];
		
		for(int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
