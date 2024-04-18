package practice;

import java.util.Scanner;

import practice.OuterClass.InnerClass;

//	Polymorphism 
class Animal {
	void makeSound() {
		System.out.println("Animal making a sound...");
	}
}

class Dog extends Animal {
	void makeSound() {
		System.out.println("Dog barking...");
	}
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("Cat meowing...");
	}
}

class Elephant extends Animal {
	void makeSound() {
		System.out.println("Elephant trumpeting...");
	}
}

//	Inner Classes	
class OuterClass {
	int x = 10;

	class InnerClass {
		int y = 5;
	}
}

//	Abstraction 
abstract class Animals {
	public abstract void animalSound();

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Pig extends Animals {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

//	Interface
interface SoftwareCompanies {
	public void Training(); // interface method (does not have a body)

	public void Works(); // interface method (does not have a body)
}

class Vishesh implements SoftwareCompanies {
	public void Training() {
		System.out.println("6 months");
	}

	public void Works() {
		System.out.println("Creative Design, UI/UX, Full-stack");
	}
}

//	Multiple Interfaces	
interface FirstInterface {
	public void myMethod(); // interface method
}

interface SecondInterface {
	public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Some text..");
	}

	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}

//	Enum	
enum Level {
	LOW, MEDIUM, HIGH
}

class Sample3 {
	public static void main(String args[]) {

//    	Polymorphism 
		Animal animal;

		animal = new Dog();
		animal.makeSound();

		animal = new Cat();
		animal.makeSound();

		animal = new Elephant();
		animal.makeSound();
		System.out.println();

//		Inner Classes	
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println("Outer Class value " + myOuter.x);
		System.out.println("Inner Class value " + myInner.y);
		System.out.println();

//		Abstraction
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		System.out.println();

//		Interface
		Vishesh vishesh = new Vishesh();
		vishesh.Training();
		vishesh.Works();
		System.out.println();

		
//		Multiple Interfaces		
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
		System.out.println();

		
//		Enum
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
		System.out.println();
		
		for (Level level : Level.values()) {
			System.out.println(level);
		}
		System.out.println();

		

//		User Input
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter your name");
	    String userName = scanner.nextLine();  // Read user input
	    System.out.println("Your name is: " + userName);  // Output user input
	}
}