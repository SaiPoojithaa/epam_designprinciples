package com.epam.calci;
import java.util.Scanner;
public class Calculator {
	public static int addition(int a,int b)
	{
		return a+b;
	}
	public static int subtraction(int a,int b)
	{
		return a-b;
	}
	public static int multiplication(int a,int b)
	{
		return a*b;
	}
	public static double division(int a,int b)
	{
		return a/b;
	}
	public static int modulo(int a,int b)
			{
	          return a%b;
			}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter first value:");
		int number1=s.nextInt();
		System.out.println("enter second value:");
		int number2=s.nextInt();
		System.out.println("enter your chocies");
		System.out.println(" 1\tAdd\n 2\tSubtract\n 3\tMultiply\n 4\tDivide\n 5\tModulo");
		int operation=s.nextInt();
		switch(operation)
		{
		case 1:	System.out.println("Result="+addition(number1,number2));
		break;
		case 2: System.out.println("Result="+subtraction(number1,number2));
		break;
		case 3: System.out.println("Result="+multiplication(number1,number2));
		break;
		case 4: System.out.println("Result="+division(number1,number2));
		break;
		case 5: System.out.println("Result="+modulo(number1,number2));
		default: System.out.println("Enter valid a chocie..");
		}
		
	}

}
