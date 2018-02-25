package java06;

public class jv06_01_왜메서드를쓰는가 {
	
	public static void main(String[] args) {
		
		// 1부터 10까지의 합계를 구하고 그 합계를 sum에 저장, 출력한다.
		int sum = 0;
		for(int i = 1; i <= 10; i = i + 1) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		// 1부터 100까지의 합계를 구하고 그 합계를 sum2에 저장, 출력한다.
		int sum2 = 0;
		for(int i = 1; i <= 100; i = i + 1) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		
		// 100부터 sum2까지의 합계를 구하고 그 합계를 sum3에 저장, 출력한다.
		int sum3 = 0;
		for(int i = 100; i <= sum2; i = i + 1) {
			sum3 = sum3 + i;
		}
		System.out.println(sum3);
		
	}

}
