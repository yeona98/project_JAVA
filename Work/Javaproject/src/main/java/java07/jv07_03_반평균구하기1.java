package java07;

import java.util.Scanner;

public class jv07_03_����ձ��ϱ�1 {
	
	public static void main(String[] args) {
		
		// �迭 ����
		int [] grade = new int[3];
		
		// �迭�� �� �ֱ�
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < grade.length; i++) {
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			grade[i] = keyboard.nextInt();
		}
		
		// for���� �̿��Ͽ� �迭���� ���
		System.out.print("�迭�� ���� : ");
		for(int i = 0; i < grade.length; i++) {
			if(i == grade.length - 1) {
				System.out.print(grade[i] + ".");
			}
			else {
				System.out.print(grade[i] + ",");
			}
		}
		
	}

}
