package lecture_03;

public class Calculate_power 
{
	public static  void main (String []args ) 
	{
		int result = power (3,4);
		System.out.print(result);
	}
public static int power (int X,int N) 
    {
	if (N == 0) 
	{
		return 1;
	}
	int result = power (X , N-1 );
	return result * X;
	}
}