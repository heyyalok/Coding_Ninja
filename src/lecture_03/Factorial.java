package lecture_03;

public class Factorial {
	public static int fact(int n)
	{
		if (n ==0 ) 
		{
			return 1;
		}
		int smaller = fact (n - 1);
		return n * smaller ; 
	}
	public static void main (String[]args) 
	{
		int result = fact(6);
		System.out.print (result);
	}
}
