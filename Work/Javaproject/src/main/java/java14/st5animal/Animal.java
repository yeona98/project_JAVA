package java14.st5animal;

public class Animal {
	

	private int weight;
	private String picture;
	
	public void eat() {
	
	}
	
	public void sleep() {
		
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public Animal() {
		super();
	}

	public Animal(int weight, String picture) {
		super();
		this.weight = weight;
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", picture=" + picture + "]";
	}

}
