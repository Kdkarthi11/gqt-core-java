package com.gqt.corejava.variables;

class Dog{
	String name;
	String color;
	String breed;
	int cost;
	
	void allocateData() {
		name="Rockey";
		color ="black";
		breed ="Gs";
		cost = 7000;
	}
	void display() {
		System.out.println("Displaying the details :-");
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
	}

}

public class InstanceVariables {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.display();
		System.out.println("-----------------------");
		d1.name="Sammy";
		d1.allocateData();
		d1.display();
	}

}
