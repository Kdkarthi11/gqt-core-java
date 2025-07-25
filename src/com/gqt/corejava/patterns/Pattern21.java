package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count in character type: ");
		char c = sc.next().charAt(0);
		sc.close();
		for (char ch='A';ch<=c;ch++) {
			for (int j= 'A'; j <= ch; j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
