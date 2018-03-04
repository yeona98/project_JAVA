package java13.st2methodtype;

public class MethodType {
	private static int iCount = 0;
	private static int nums = 0;
	
	public static void instanceMethod() {
		iCount = 100;
		nums = 10;
	}
	public void instanceMethod2() {
		staticMethod();
	}
	public static void staticMethod() {
		instanceMethod();
	}
	public void staticMethod2() {
		nums = 10;
		staticMethod();
	}

}
