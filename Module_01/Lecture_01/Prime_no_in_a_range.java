package Lecture_01;
//trying to build new approach
//without using temp variable
//modified 18th may wrong approach
// not correct way
public class Prime_no_in_a_range 
{
	static public int  prime_in_range (int n) 
	{
		int i =1;
		while (i<=n)
		{
			int j =2;
			while(j<i)
			{
				if (i%j!=0)
				{
					return i;
				}
				j=j+1;
			}
			i++;
		}
		return 0;
	}
	static public void main (String[]args) 
	{
		int number =  prime_in_range(30);
		System.out.println(number);
	}
}
