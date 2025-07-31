
/**
 * 3 colleges
 * medical - 3 classrooms - capacity - 5,8,6
 * engineering - 6 classrooms - capacity - 6,7,8,9,10,11
 * degree - 2 classrooms - capacity - 3 , 5
 *  
 */
package com.gqt.corejava.array_programming;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Array
 * @description This is an example for Structured Array Program - Three Dimensional Array 
 */

class CourseProfitOperations  {
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	long medical_fee ;
	long engineering_fee ;
	long degree_fee ;
	long m_total;
	long e_total;
	long d_total;


	void createArray() {
		System.out.print("Enter the Colleges count: ");
		int clg = sc.nextInt();

		//collecting the class count
		arr = new String[clg][][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the class count inside the College no " + (i + 1));
			arr[i]=new String[sc.nextInt()][];
		}
		//collecting the capcity count
		for (int i = 0; i < arr.length;i++) {
			System.out.println("Inside the College no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the Class Room capacity inside the class no: " + (j + 1));
				arr[i][j]= new String[sc.nextInt()];
			}
		}
		
		System.out.println("The array is created.");
		System.out.println("Enter the medical fee: ");
		medical_fee = sc.nextLong();
		System.out.println("Enter the Engineering fee: ");
		engineering_fee = sc.nextLong();
		System.out.println("Enter the Degree fee: ");
		degree_fee = sc.nextLong();
		System.out.println("-------------------------------------");
	}

	void collectData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside the College no " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside the ClassRoom no " + (j + 1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of the Student no: " + (k + 1));
					arr[i][j][k]= sc.next();
					if(i==0) {
						m_total+= medical_fee;
					}
					else if(i==1) {
						e_total+= engineering_fee;
					}
					else if(i==2) {
						d_total+= degree_fee;
					}
				}
			}
		}
		System.out.println("Data is collected and calculated");
		System.out.println("--------------------------------------");
	}

	void displayData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside the College no " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside the ClassRoom no " + (j + 1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of the Student in College no: "+(i+1)+" and the classRoom no: "+(j+1)+" => " + arr[i][j][k]);
				}
			}
		}
		System.out.println(" Total revenue generated in the yeaar of 2024 - 2025 : "+ (m_total+e_total+d_total));
		System.out.println("---------------------------------");
	}

}

public class ArrayProgram_EducationalTrust {

	/**
	 * @param args
	 * @description This contains source code for the Array Program
	 */
	public static void main(String[] args) {
		CourseProfitOperations  ao = new CourseProfitOperations ();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}

}
