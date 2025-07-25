package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count for rows: ");
		int n = sc.nextInt();
		System.out.print("Enter the count for cols: ");
		int m = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("1 ");
				} 
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
