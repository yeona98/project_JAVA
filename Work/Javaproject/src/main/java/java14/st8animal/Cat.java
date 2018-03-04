package java14.st8animal;

import java14.st5animal.Animal;

public class Cat extends Animal {
	
	@Override
	public void eat() {
		System.out.println("Cat eat");
		super.eat();
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleep");
		super.sleep();
	}

	public void play() {
		
		System.out.println("Cat play");
		return;
	}

}
