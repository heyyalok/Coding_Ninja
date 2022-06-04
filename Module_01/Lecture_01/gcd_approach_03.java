package Lecture_01;

public class GCD_approach_03 {
	public static int gcdfind(int a, int b) 
	{
		if (a%b==0) 
		{
			return b;
		}
		int temp ;
		//int gcd = 0;
		while(b!=0) 
		{
			temp = b;
			b= a%b;
			a=temp;  
		}
		return a;
	}
	public static void main (String []args) 
	{
		int gcd_value  = gcdfind(28,8);
		System.out.println(gcd_value);
	}
}
