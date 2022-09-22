package lecture_04;

public class ReturnSubsequences {
	public static void main (String[]args) 
	{
		String a = "xyz";
		String [] finalAns = returnSubsequences(a);
		print(finalAns);
	}
	private static String [] returnSubsequences(String input) 
	{
		if (input.length()<=0) 
		{
			String ans[] = {" "};// remember when we have to return empty string we can return like this;
			return ans;
		}
		String []smallAns = returnSubsequences(input.substring(1));
		String []finalAns = new String[smallAns.length *2];
		int  k  = 0;
		for (int  i = 0; i<smallAns.length ;i++) 
		{
			finalAns[i] = smallAns[i];
			k++;
		}
		//System.out.println("hello");
		for (int j  = 0 ; k<finalAns.length; k++, j++) 
		{
			finalAns[k]= input.charAt(0)+smallAns[j];
		}
		return finalAns;
	}
	private static void print (String[] input) 
	{
		for (int i = 0; i<input.length ;i++) 
		{
			System.out.println(input[i]);
		}
	}

}
