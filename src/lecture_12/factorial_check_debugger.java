package lecture_12;

public class factorial_check_debugger {
	public static void main (String[]args) 
	{
		int n = 6;
		int result = factorial (n);
		System.out.print(result);
	}
	private static int factorial (int n ) 
	{
		if (n == 1) 
		{
			return 1; 
		}
		return n * factorial (n-1);
	}

}
