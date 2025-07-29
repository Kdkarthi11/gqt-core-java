/**
 * 
 */
package com.gqt.corejava.array_programming;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Array
 * @description This is an example for Structured Array Program - One Dimensional Array 
 */

class ArrayOperations {
	int arr[];
	Scanner sc = new Scanner(System.in);

	void CreateArray() {
		System.out.println("Enter the student count: ");
		int n = sc.nextInt();

		// creating the array to store n students marks
		arr = new int[n];
		System.out.println(" Array is created.");
		System.out.println("--------------------------");

	}

	void CollectData() {
		// collecting and storing marks of n students
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Enter the marks of student no: " + (i + 1));
			arr[i] = sc.nextInt();
		}
		System.out.println("Data is stored into the array.");
		System.out.println("---------------------------------");
	}

	void DisplayData() {
		//display marks stored inside the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" The marks of the student no: " + (i + 1) + " is = " + arr[i]);
		}
	}
}

public class ArrayCode2 {

	/**
	 * @param args
	 * @description This contains source code for the Array Program
	 */
	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		ao.CreateArray();
		ao.CollectData();
		ao.DisplayData();

	}

}
