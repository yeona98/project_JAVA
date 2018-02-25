package java11;

public class Oper {
	
	public Oper() {
		super();
	}
	public Oper(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	// 필드
	private int firstNum;
	private int secondNum;
	
	// 메서드
	public int Add() {
		return firstNum + secondNum;
	}
	public int Minus() {
		return firstNum - secondNum;
	}
	public int Mul() {
		return firstNum * secondNum;
	}
	public double Div() {
		return (double)firstNum / (double)secondNum;
	}
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	@Override
	public String toString() {
		return "Oper [firstNum=" + firstNum + ", secondNum=" + secondNum + "]";
	}

}
