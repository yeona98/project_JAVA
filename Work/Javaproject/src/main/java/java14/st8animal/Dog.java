package java14.st8animal;

import java14.st5animal.Animal;

public class Dog extends Animal {
	
	@Override
	public void eat() {
		System.out.println("Dog eat");
		super.eat();
	}

	@Override
	public void sleep() {
		System.out.println("Dog sleep");
		super.sleep();
		
	}
	public void bark() {
		System.out.println("Dog bark");
		return;
	}
}
