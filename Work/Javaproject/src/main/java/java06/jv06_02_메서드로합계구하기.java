package java06;

public class jv06_02_�޼�����հ豸�ϱ� {

	public static void main(String[] args) {
		
		int sum = getSum(1, 10);
		System.out.println("1���� 10���� �հ� = " + sum);
		
		int sum2 = getSum(1,100);
		System.out.println("1���� 100���� �հ� = " + sum2);
		
		int sum3 = getSum(100, sum2);
		System.out.println("100����" + sum2 + "���� �հ� = " + sum3);
		
	}
	
	public static int getSum(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i = i + 1) {
			sum = sum + i;
		}
		return sum;
	}
}
