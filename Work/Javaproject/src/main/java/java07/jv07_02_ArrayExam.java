package java07;

public class jv07_02_ArrayExam {
	
	public static void main(String[] args) {
		// �迭�� ����
		int size = 6;
		int [] numbers = new int[size];
		
		// �迭�� ���� ����
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = -1;
		}
		
		// for���� ����Ͽ� �迭�� �� ���
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
