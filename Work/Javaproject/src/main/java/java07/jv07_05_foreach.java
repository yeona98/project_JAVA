package java07;

public class jv07_05_foreach {
	
	public static void main(String[] args) {
		// 배열의 선언
		int [] numbers = {10, 20, 30};
		
		// for문을 사용하여 배열의 값 출력
		for(int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
		
		// 배열에 값을 대입
		for(int value : numbers) {
			System.out.println(value);
		}
	}

}
