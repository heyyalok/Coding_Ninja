package Lecture_01;

public class All_fibonacci_series 
{
	public static void main (String[]args) 
	{
		int n = 12;
		// fibonacci series in this range
		int a = 0, b = 1;
		while (a<=n)
		{
			System.out.print(a+" ");
			int c = a+b;
			a= b;
			b=c;
		}
	}
}
