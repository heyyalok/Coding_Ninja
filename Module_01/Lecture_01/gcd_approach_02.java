package Lecture_01;

public class GCD_approach_02 {
	public static int gcdfun(int a, int b) 
	{
		int smaller = a;
		if (a<b) 
		{
			if (b%a==0) 
			{
				return a;
			}
		}
		smaller = b;
			if (a%b==0) 
			{
				return b;
			}
			int i = 1;
			int gcd = 1;
			while (i<=smaller) 
			{
				if (a%i== 0 && b%i==0) 
				{
					gcd = i;
				}
				i=i+1;
			}
			return gcd;
	}
	public static void main (String[]args) 
	{
		int gcdout = gcdfun(12,8);
		System.out.println(gcdout);
	}
}
