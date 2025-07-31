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

class AdditionOperation {
	long A[][];
	long B[][];
	long C[][];
	Scanner sc = new Scanner(System.in);

	void createArray() {
//		Matrix A
		System.out.print("Enter the Row size for Matrics A: ");
		int m = sc.nextInt();
		System.out.print("Enter the column size for Matrics A: ");
		int n = sc.nextInt();
//		//matrix B

		// creating the 2D array
		A = new long[m][n];
		B = new long[m][n];
		C= new long[m][n];
	

		System.out.println("The array is created.");

		System.out.println("-------------------------------------");
	}

	void collectData() {
		//matrix A
		System.out.println("Enter the Matrix-A vlaues:- ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.println("A[" + i + "]" + "[" + j + "] : ");
				A[i][j]=sc.nextLong();
			}
		}
//		matrix B
		System.out.println("\nEnter the Matrix-B vlaues:- ");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.println("B[" + i + "]" + "[" + j + "] : ");
				B[i][j]=sc.nextLong();
			}
		}
		
		// addition of A+B:-
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[i].length; j++) {
				C[i][j]=A[i][j]+B[i][j];
			}
		}

		System.out.println("Data is collected .");
		System.out.println("--------------------------------------");
	}

	void displayData() {
		System.out.println("The resultant matrix(A+B)");
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[i].length; j++) {
				System.out.print(C[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

public class ArrayProgram_AdditionOf2DMatrix {

	/**
	 * @param args
	 * @description This contains source code for the Array Program
	 */
	public static void main(String[] args) {
		AdditionOperation ao = new AdditionOperation();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}

}
