package Lecture_01;
import java.util.Scanner;
public class Valid_triangle
{
	public static void main (String[]args)
	{
		Scanner scr = new Scanner (System.in);
		System.out.println("enter the first side of triangle");
		int a = scr.nextInt();
		System.out.println("enter the second side of triangle");
		int b = scr.nextInt();
		System.out.println("enter the third side of triangle");
		int c = scr.nextInt();
		if (a+b>c && a+c>b && b+c>a) 
		{
			System.out.println("valid triangle");
		}
		else 
		{
			System.out.println("invalid triangle");
		}
	}
}
