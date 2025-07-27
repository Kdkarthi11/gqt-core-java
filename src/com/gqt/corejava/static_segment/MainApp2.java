package com.gqt.corejava.static_segment;

import java.util.Scanner;

class AadharCard {
	String name;
	String gender;
	long aadharno;
	long mobileno;
	static String nationality;
	
	static {
		nationality ="Indian";
	}
	
	void collectData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("----- Enter the Required Aadhar Card Details -----");
		System.out.print("Enter your Name: ");
		name=sc.nextLine();
		System.out.print("Enter your Gender: ");
		gender=sc.nextLine();
		System.out.print("Enter your Aadhar Number: ");
		aadharno=sc.nextLong();
		System.out.print("Enter your Mobile Number: ");
		mobileno=sc.nextLong();
	}
	
	void displayData() {
		System.out.println("----- Aadhar Card Details -----");
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Aadhar Number: " + aadharno);
		System.out.println("Nationality: " + nationality);
	}
	
} 

public class MainApp2 {

	public static void main(String[] args) {
		AadharCard user1 = new AadharCard();
		AadharCard user2 = new AadharCard();
		AadharCard user3 = new AadharCard();
		AadharCard user4 = new AadharCard();
		
		System.out.println("----------------- USER1 ---------------------");
		user1.collectData();
		user1.displayData();
		
		System.out.println("\n----------------- USER2 ---------------------");
		user2.collectData();
		user2.displayData();
		
		System.out.println("\n----------------- USER3 ---------------------");
		user3.collectData();
		user3.displayData();
		
		System.out.println("\n----------------- USER4 ---------------------");
		user4.collectData();
		user4.displayData();

	}

}
