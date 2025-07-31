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

class MultiplicationOperation {
	long A[][];
	long B[][];
	long C[][];
	Scanner sc = new Scanner(System.in);

	void createArray() {
		System.out.print("Enter rows of Matrix A: ");
        int m = sc.nextInt();
        System.out.print("Enter columns of Matrix A : ");
        int n = sc.nextInt();
        System.out.print("Enter rows of Matrix B: ");
        int p = sc.nextInt();
        System.out.print("Enter columns of Matrix B: ");
        int q = sc.nextInt();
        
        if(n!=p) {
        	System.out.println("We cant do the Matrix Multiplication.");
        	System.exit(0);  
        }
        else {
        	// creating the 2D array
    		A = new long[m][n];
    		B = new long[p][q];
    		C = new long[m][q];
        }
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
				for(int k=0; k< A[0].length;k++) {
					C[i][j]+=A[i][k]*B[k][j];
				}
			}
		}

		System.out.println("Data is collected .");
		System.out.println("--------------------------------------");
	}

	void displayData() {
		System.out.println("The resultant matrix(A+B)");
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[i].length; j++) {
				System.out.print(C[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

public class ArrayProgram_MultiplicationOf2DMatrix {

	/**
	 * @param args
	 * @description This contains source code for the Array Program
	 */
	public static void main(String[] args) {
		MultiplicationOperation mo = new MultiplicationOperation();
		mo.createArray();
		mo.collectData();
		mo.displayData();
	}

}
