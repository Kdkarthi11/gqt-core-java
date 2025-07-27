package com.gqt.corejava.variables;


class Calculator{
	void add() {
		int a=10;
		int b=20;
		int res = a+b;
		System.out.println("The addition result is: "+res);
	}
	
	void sub(int b,int c) {
		int res = b-c;
		System.out.println("The subtraction result is: "+res);
	}
}

public class LocalVariables {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add();
		System.out.println("-----------------------------");
		c1.sub(30, 10);
	}

}
