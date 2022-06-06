package Lecture_01;

public class sum_of_evens {
	public static void main (String[]args) 
	{
		int n = 6;
		int i = 1;
		int sum = 0;
		for (;i<=n;i++) 
		{
			if (i%2==0) 
			{
				sum = sum +i;
			}
		}
		System.out.println(sum);
	}
}
