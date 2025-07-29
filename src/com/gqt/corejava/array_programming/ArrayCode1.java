/**
 * 
 */
package com.gqt.corejava.array_programming;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Array
 * @description This is an example for Unstructured Array Program - One Dimensional Array 
 */
public class ArrayCode1 {

	/**
	 * @param args
	 * @description This contains source code for the Array Program
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stident count: ");
		int n = sc.nextInt();

		// creating the array to store n students marks
		int[] arr = new int[n];

		// collecting and storing marks of n students

		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Enter the marks of student no: " + (i + 1));
			arr[i] = sc.nextInt();
		}
		System.out.println("-------------------------------");

		//display marks stored inside the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" the marks of the student no: " + (i + 1) + " is = " + arr[i]);
		}
		sc.close();

	}

}
