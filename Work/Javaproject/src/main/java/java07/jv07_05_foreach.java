package java07;

public class jv07_05_foreach {
	
	public static void main(String[] args) {
		// �迭�� ����
		int [] numbers = {10, 20, 30};
		
		// for���� ����Ͽ� �迭�� �� ���
		for(int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
		
		// �迭�� ���� ����
		for(int value : numbers) {
			System.out.println(value);
		}
	}

}
