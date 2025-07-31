/**
 * 
 */
package com.gqt.corejava.array_programming;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Array
 * @description This is an example for Structured Array Program - Three Dimensional Array 
 */

class ArrayOperations3  {
	String arr[][][];
	Scanner sc = new Scanner(System.in);

	void createArray() {
		System.out.print("Enter the School count: ");
		int schl = sc.nextInt();

		//collecting the class count
		arr = new String[schl][][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the class count inside the School no " + (i + 1));
			arr[i]=new String[sc.nextInt()][];
		}
		//collecting the class count
		for (int i = 0; i < arr.length;i++) {
			System.out.println("Inside the school no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the Student count inside the class no: " + (j + 1));
				arr[i][j]= new String[sc.nextInt()];
			}
		}
		
		System.out.println("The array is created.");
		System.out.println("-------------------------------------");
	}

	void collectData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside the School no " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside the Class no " + (j + 1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of the Student no: " + (k + 1));
					arr[i][j][k]= sc.next();
				}
			}
		}
		System.out.println("Data is collected.");
		System.out.println("--------------------------------------");
	}

	void displayData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside the School no " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside the Class no " + (j + 1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of the Student in school no: "+(i+1)+" and the class no: "+(j+1)+" => " + arr[i][j][k]);
				}
			}
		}
		System.out.println("---------------------------------");
	}

}

public class ArrayProgram3DJackedArray {

	/**
	 * @param args
	 * @description This contains source code for the Array Program
	 */
	public static void main(String[] args) {
		ArrayOperations3  ao = new ArrayOperations3 ();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}

}
