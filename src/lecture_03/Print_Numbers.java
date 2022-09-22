package lecture_03;

public class Print_Numbers 
{
	public static void main (String[]args)
	{
		print(6);
		
	}
	public static void print (int n )
	{
		if  (n == 1) 
		{
			System.out.print(n+" ");
			return;
		}
		    print (n-1);
			System.out.print(n+" ");
	}
}