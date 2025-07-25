package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern22 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n =sc.nextInt();
		sc.close();
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
