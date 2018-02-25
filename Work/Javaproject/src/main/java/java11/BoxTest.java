package java11;

public class BoxTest {
	
	public static void main(String[] args) {
		
		// Box 인스턴스 생성, 필드값 설정
		Box myBox = new Box(100, 100, 100);
		myBox.getVolumn();
		myBox.printVolumn();
		
		System.out.println(myBox.toString());
		
	}

}
