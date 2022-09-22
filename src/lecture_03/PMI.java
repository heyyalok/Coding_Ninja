package lecture_03;

// hint formula 
// result =  (n*(n+1))/2
public class PMI {
	public static int pmi(int n) {
		//int sum  = (n*(n+1))/2;
		//return
		if (n  == 1)// this is the base case , here we have to check weather that till 
			//which number we have to call our recursion function 
		{
			return 1;
		}
		return n+pmi(n-1);
	}
	public static void main (String [] args) 
	{
		int result =  pmi (20);
		System.out.print(result);
	}

}
