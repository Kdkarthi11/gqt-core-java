package com.gqt.corejava.static_segment;

class Program1{
	int a,b,c;//non-static variables
	static int p,q,r;//static variables
	
	//non - static block
	{
		a=100;
		b=200;
		c=300;
		
		//static variables are permitted inside the non-static method.
		p=77;
		q=88;
		r=99;
		
	}
	//static block
	static {
		p=111;
		q=222;
		r=333;
		
		//non-static variables are not permitted inside the static method.
//		a=99;
//		b=88;
//		c=77;
	}
	//non-static method
	void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//static variables are permitted inside the non-static method.
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
	}
	//static method
	static void display2() {
		//static variables are permitted inside the static method.
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
		//non-static variables are not permitted inside the static method.
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	}
}

public class StaticMembers1 {
	public static void main(String[] args) {
		Program1.display2();
		System.out.println("-----------------");
		Program1.p=7000;
		Program1.display2();
		System.out.println("-----------------");

		
		Program1 d1 = new Program1();
		d1.display1();
		System.out.println("-----------------");
		d1.display2();
		
		System.out.println("-----------------");
		d1.q=500;
		d1.display2();
	}
}
