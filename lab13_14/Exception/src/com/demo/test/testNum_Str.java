package com.demo.test;
import java.util.Scanner;
public class testNum_Str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		
		System.out.println("enter num1");
		int x = sc.nextInt();
		System.out.println("enter num2");
		int y = sc.nextInt();
		int ans = divid(x,y);
		System.out.println(ans);
		}catch(Exception ArithmeticException )
		{
			System.out.println("0 is not allowed in dinominater");
		}
		
	}

	private static int divid(int x, int y) {
		return (int)(x/y);
	}

}
