package java04;

public class ex04_02_forsum {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i = i + 1) {
			sum = sum + i;
			// System.out.println("1부터 " + i + "까지의 합: " + sum);
			
			System.out.printf("1부터 %2d까지의 합: %2d \n", i, sum);
		}
	}

}
