package core_java;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args)
	{
		int i,fact=1;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an Integer:");
		int num = input.nextInt();
		    
		  for(i=1;i<=num;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+num+" is: "+fact);    
		 }  
	}
