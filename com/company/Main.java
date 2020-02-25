package com.company;

import static java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		double c=Math.random();
		double d=Math.random();
		int num1 = a + (int) (c * b);
		System.out.println(c);
		System.out.println(+num1);
		int num2 = a + (int) ( d* b);
		System.out.println(d);
		System.out.println(+num2);
		int x = Math.min(num1, num2);
		System.out.println("Minimal number = " + x);
	}


}
