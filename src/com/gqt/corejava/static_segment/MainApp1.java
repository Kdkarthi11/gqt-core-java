package com.gqt.corejava.static_segment;

import java.util.Scanner;

class Farmer{
	double principle;
	static double rate; //double rate;
	double time;
	double si;
	
    static {
    	rate =2.789;
    }
    
    void collectData() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Principle: ");
    	principle = sc.nextInt();
    	System.out.print("Enter the Time: ");
    	time= sc.nextInt();
    }
    
    void calculate() {
    	si = principle*rate*time/100;
    }
    
    void display() {
    	System.out.print("The Simple interest is : "+si);
    }
}

public class MainApp1 {

	public static void main(String[] args) {
		Farmer f1= new Farmer(); 
		Farmer f2= new Farmer(); 
		Farmer f3= new Farmer(); 
		
		System.out.print("Farmer 1 \n");
		f1.collectData();
		f1.calculate();
		f1.display();
		System.out.println("-------------------------");

		System.out.print("Farmer 2 \n");
		f2.collectData();
		f2.calculate();
		f2.display();
		System.out.println("-------------------------");

		System.out.print("Farmer 3 \n");
		f3.collectData();
		f3.calculate();
		f3.display();
	}
}
