package java04;

public class ex04_02_forsum {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i = i + 1) {
			sum = sum + i;
			// System.out.println("1���� " + i + "������ ��: " + sum);
			
			System.out.printf("1���� %2d������ ��: %2d \n", i, sum);
		}
	}

}
