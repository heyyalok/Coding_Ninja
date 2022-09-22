package lecture_03;

public class Number_of_digits
{
	public static void main (String [] args) 
	{
		int ans = count(456);
		System.out.print(ans);
	}


public static int count (int n) 
{
	if (n == 0) 
	{
		return 0;
	}
	int ans = count (n/10);
	return ans+1;
}
}