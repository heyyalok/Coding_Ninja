package Lecture_01;
import java.util.Scanner;
public class Member_of_fibonacci_series 
{
	public static boolean fibonacci_term (int n) 
	{
		int a = 0;
		int b = 1;
		while  (a<n) 
		{
			int c = a+b;
			a = b;
			b = c;
			if (a==n) 
			{
				return true;
		    }
		}
		return false;
	}
	public static void main (String[]args) 
	{
		Scanner scr = new Scanner (System.in);
		System.out.println("which no u want to enter");
		int number = scr.nextInt();
		scr.close();
		System.out.print(fibonacci_term(number));
	}
}
