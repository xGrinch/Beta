package com.company;

import static java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		int num1 = a + (int) (Math.random() * b);
		System.out.println(+num1);
		int num2 = a + (int) (Math.random() * b);
		System.out.println(+num2);
		int x = Math.min(num1, num2);
		System.out.println("Minimal number = " +x);


			}


}
