package java07;

import java.util.Scanner;

public class jv07_03_����ձ��ϱ�2 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// �迭 ����
		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� : ");
		int size = keyboard.nextInt();
		int [] grade = new int[size];
		
		// �迭�� �� �ֱ�
		
		for(int i = 0; i < grade.length; i++) {
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			grade[i] = keyboard.nextInt();
		}
		
		// for���� �̿��Ͽ� �迭���� ���
		System.out.print("�迭�� ���� : ");
		for(int i = 0; i < grade.length; i++) {
			if(i == grade.length - 1) {
				System.out.print(grade[i]);
			}
			else {
				System.out.print(grade[i] + ",");
			}
		}
		
	}

}
