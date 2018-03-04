package java14.st3car;

public class SportsCar extends Car {

	private boolean turbo;
	
	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

	@Override
	public String toString() {
		return "SportsCar [turbo=" + turbo + ", getSpeed()=" + getSpeed() + ", getGear()=" + getGear() + ", getColor()="
				+ getColor() + "]";
	}
	

	
	public SportsCar(String color, boolean turbo) {
		super(color);
		this.turbo = turbo;
	}

	public SportsCar(int speed, int gear, String color, boolean turbo) {
		super(speed, gear, color);
		this.turbo = turbo;
	}

	public SportsCar() {
		super();
	}

	public SportsCar(boolean turbo) {
		super();
		this.turbo = turbo;
	}
}
