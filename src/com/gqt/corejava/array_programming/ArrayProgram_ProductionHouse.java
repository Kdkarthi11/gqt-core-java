/**
 * 
 */
package com.gqt.corejava.array_programming;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Array
 * @description This is an example for Structured Array Program - Three
 *              Dimensional Array
 */

class MovieOperations {
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	Scanner sc = new Scanner(System.in);

	void createArray() {
		System.out.print("Enter the language count: ");
		int lan = sc.nextInt();
		System.out.print("Enter the category count in each language: ");
		int cat = sc.nextInt();
		System.out.print("Enter the movie count in each category: ");
		int mov = sc.nextInt();

		// creating the 3D array
		arr = new long[lan][cat][mov];

		System.out.println("The array is created.");

		System.out.println("Enter the investment made: ");
		investment = sc.nextLong();
		System.out.println("Enter the Profit made in financial year 2023 - 2024: ");
		prev_profit = sc.nextLong();

		System.out.println("-------------------------------------");
	}

	void collectRevenueData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside the Langiuage  no " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside the Category  no " + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter the Investment of the movie no: " + (k + 1));
					arr[i][j][k] = sc.nextLong();
					sum_revenue += arr[i][j][k];
				}
			}
		}

		System.out.println("Data is collected and Calculated.");
		System.out.println("--------------------------------------");
	}

	void displayData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside the Langiuage  no " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside the Category  no " + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("The Revenue of the movie no: " + (k + 1) + " is: " + arr[i][j][k]);
				}
			}

		}
		System.out.println("---------------------------------");
		if (sum_revenue > investment) {
			long profit = sum_revenue - investment;
			System.out.println("The total revenue generated in year 2024 - 2025: " + profit);
			if (profit > prev_profit) {
				System.out.println("Hemanth has made more profit than the previous year!..");
			} else {
				System.out.println("Hemanth has not made more profit than the previous year!..");
			}
		} else {
			System.out.println("The total revenue generated in year 2024 - 2025: " + (investment - sum_revenue));
		}

		System.out.println("---------------------------------");

	}
}

public class ArrayProgram_ProductionHouse {

	/**
	 * @param args
	 * @description This contains source code for the Array Program
	 */
	public static void main(String[] args) {
		MovieOperations mo = new MovieOperations();
		mo.createArray();
		mo.collectRevenueData();
		mo.displayData();
	}

}
