package java07;

public class jv07_01_�迭�Ǽ���������� {
	
	public static void main(String[] args) {
		
		// ���� �迭�� ����
		int [] arr ;
		
		// ũ�Ⱑ 5�� ���� �迭�� ����
		arr = new int[5];
		
		// �迭�� ���� ����
		// 0���濡�� 10�� �ְ�
		arr[0] = 10;
		// 1���濡�� 100�� �ְ�
		arr[1] = 100;
		// �������濡�� -1�� �����ÿ�
		arr[5 - 1] = -1;
		arr[arr.length - 1] = -1; // ��õ
		
		// �迭�� ���
		for(int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
	}

}
