package java13.st3callstack;

public class CallStack {
	
	public static void main(String[] args) {
		firstMethod();
	}
	public static void firstMethod() { 
		secondMethod();
	}
	public static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
