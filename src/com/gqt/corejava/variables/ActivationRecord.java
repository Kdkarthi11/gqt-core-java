package com.gqt.corejava.variables;

class Dogs{
	String name;
	String color;
	String breed;
	int cost;
	
	void run() {
		System.out.println("Dog runs..");
	}
	void eat() {
		System.out.println("Dog eats..");
	}

}

public class ActivationRecord {
	public static void main(String[] args) {
		Dogs d1 = new Dogs();
		
		System.out.println("Name of the Dog is: "+d1.name);
		System.out.println("Color of the Dog is: "+d1.color);
		System.out.println("Breed of the Dog is: "+d1.breed);
		System.out.println("Cost of the Dog is: "+d1.cost);
		
		System.out.println("-------------------------");
		
		d1.name="Jimmy";
		d1.color="Brown";
		d1.breed="Pug";
		d1.cost=7000;

		System.out.println("Name of the Dog is: "+d1.name);
		System.out.println("Color of the Dog is: "+d1.color);
		System.out.println("Breed of the Dog is: "+d1.breed);
		System.out.println("Cost of the Dog is: "+d1.cost);
		
		System.out.println("-------------------------");

		d1.run();
		d1.eat();

	}

}

