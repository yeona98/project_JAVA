package java07;

public class jv07_01_배열의선언생성대입 {
	
	public static void main(String[] args) {
		
		// 정수 배열의 선언
		int [] arr ;
		
		// 크기가 5인 정수 배열의 생성
		arr = new int[5];
		
		// 배열에 값을 대입
		// 0번방에는 10을 넣고
		arr[0] = 10;
		// 1번방에는 100을 넣고
		arr[1] = 100;
		// 마지막방에는 -1을 넣으시오
		arr[5 - 1] = -1;
		arr[arr.length - 1] = -1; // 추천
		
		// 배열값 출력
		for(int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
	}

}
