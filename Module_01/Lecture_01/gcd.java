package Lecture_01;

public class GCD
{
	public static void main (String[]args) 
	{
		int a = 18;
		int b = 9;
		int i = 1, gcd = 0 ;
		while(i<=a && i<=b) 
		{
			if (a%i==0 && b%i==0) 
			{
				gcd = i;
				//i=i+1;
				//System.out.print(gcd);
			}
			//else 
			//{
			//	i++;
			//}
			i++;
		}
		System.out.print(gcd);
	}
}
