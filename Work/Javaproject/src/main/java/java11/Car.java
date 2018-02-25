package java11;

public class Car {
	
	public Car() {
		super();
	}
	public Car(String color, int speed, int gear) {
		super();
		this.color = color;
		this.speed = speed;
		this.gear = gear;
	}
	
	
	// 상태 : 필드
	private String color = "red";
	private int speed = 0;
	private int gear = 1;
	
	// 동작 : 메서드
	public void speedUp(int s) {
		speed = speed + s;
	}
	public void speedDown(int s) {
		speed = speed - s;
	}
	public void speedPrint() {
		System.out.println("속도 " + speed + "km");
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
}
