package java05;

public class jv05_01_���� {
	
	public static void main(String[] args) {
		
		// ������ ����� �ʱ�ȭ
		int x = 10;
		int y = 0;
		int z = 0;
		try {
			z = x / y;
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		System.out.println("������ ���: " + z);
		
		// �迭�� ����� �ʱ�ȭ
		// �迭�� 0���� �����Ѵ�.
		int [] arr = { 1, 2, 3, 4 };
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		System.out.println("���α׷� ���� ����");
		
	}

}
