package java11;

public class BoxTest {
	
	public static void main(String[] args) {
		
		// Box �ν��Ͻ� ����, �ʵ尪 ����
		Box myBox = new Box(100, 100, 100);
		myBox.getVolumn();
		myBox.printVolumn();
		
		System.out.println(myBox.toString());
		
	}

}
