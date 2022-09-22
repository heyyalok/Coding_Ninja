package lecture_06;

public class fibonacci_number {
	
	public static long fibonacci_number (long n ) 
	{
		if (n == 0 || n == 1) 
		{
			return n;
		}
		return fibonacci_number(n-1) + fibonacci_number (n-2);
	}
	public static void main (String [] args) 
	{
		long result = fibonacci_number (60);
		System.out.print(result);
		// it takes 2^n times which is worst time taking algorithm;
	}
}