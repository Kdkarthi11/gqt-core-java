package com.gqt.corejava.patternsmediumlevel;

import java.util.Scanner;

public class MediumPattern_1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
}
