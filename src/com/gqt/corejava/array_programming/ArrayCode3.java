/**
 * 
 */
package com.gqt.corejava.array_programming;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Array
 * @description This is an example for Structured Array Program - Two Dimensional Array 
 */

class StudentArrayOperations  {
	String arr[][];
	Scanner sc = new Scanner(System.in);

	void createArray() {
		System.out.print("Enter the class count: ");
		int cls = sc.nextInt();
		System.out.print("Enter the student count: ");
		int stu = sc.nextInt();

		arr = new String[cls][stu];
		System.out.println("The array is created.");
		System.out.println("-------------------------------------");
	}

	void collectData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside the class no " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the name of the student no: " + (j + 1));
				arr[i][j] = sc.next();
			}
		}
		System.out.println("Data is collected.");
		System.out.println("--------------------------------------");
	}

	void displayData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside the class no: " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("The name of the student no: " + (j + 1) + " is = " + arr[i][j]);
			}
		}
		System.out.println("---------------------------------");
	}

}

public class ArrayCode3 {

	/**
	 * @param args
	 * @description This contains source code for the Array Program
	 */
	public static void main(String[] args) {
		StudentArrayOperations  ao = new StudentArrayOperations ();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}

}
