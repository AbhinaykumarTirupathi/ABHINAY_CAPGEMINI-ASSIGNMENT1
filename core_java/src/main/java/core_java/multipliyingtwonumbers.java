package core_java;

import java.util.Scanner;

public class multipliyingtwonumbers {

	public static void main(String[] args) {
		int c;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter two Integers:");
		int a = input.nextInt();
		int b = input.nextInt();

		c=a*b;
		System.out.println(+c);
	}

}
