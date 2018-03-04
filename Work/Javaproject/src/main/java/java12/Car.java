package java12;

public class Car {
	public Car() {
		super();
		setId(++numberOfCars);
	}
	public Car(String color, int speed, int gear) {
		super();
		this.color = color;
		this.speed = speed;
		this.gear = gear;
		// 자동차의 개수를 증가하고 id 번호를 할당한다.
		setId(++numberOfCars);
	}
	
	private String color;
	private int speed;
	private int gear;
	// 자동차의 시리얼 번호
	private int id;
	// 실체화된 Car 객체의 개수를 위한 정적 변수
	private static int numberOfCars = 0;
	
	
	
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
	
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	public static void setNumberOfCars(int numberOfCars) {
		Car.numberOfCars = numberOfCars;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
