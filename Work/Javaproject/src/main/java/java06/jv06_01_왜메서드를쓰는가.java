package java06;

public class jv06_01_�ָ޼��带���°� {
	
	public static void main(String[] args) {
		
		// 1���� 10������ �հ踦 ���ϰ� �� �հ踦 sum�� ����, ����Ѵ�.
		int sum = 0;
		for(int i = 1; i <= 10; i = i + 1) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		// 1���� 100������ �հ踦 ���ϰ� �� �հ踦 sum2�� ����, ����Ѵ�.
		int sum2 = 0;
		for(int i = 1; i <= 100; i = i + 1) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		
		// 100���� sum2������ �հ踦 ���ϰ� �� �հ踦 sum3�� ����, ����Ѵ�.
		int sum3 = 0;
		for(int i = 100; i <= sum2; i = i + 1) {
			sum3 = sum3 + i;
		}
		System.out.println(sum3);
		
	}

}
