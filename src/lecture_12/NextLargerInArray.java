package lecture_12;

public class NextLargerInArray
{
	public static void main (String[]args) 
	{
		int array [] = {50, 20, 30 , 40 , 10 , 60 , 19};
		int element = justBig(array , 18);
		System.out.print(element);
	}
	private static int justBig(int [] array , int n ) 
	{
		int justBig = 0;
		//int  i = 0;
		for (int i = 1; i<array.length ;i++)
		{
			if (array[i]>n) 
			{
				if (justBig == 0)
				{
					justBig = array[i];
				}
				else if (array[i]<justBig) 
				{
					justBig = array[i];
				}
			}
			if (justBig > array[0] && array[0]>n ) 
			{
				justBig = array[0];
			}
		}
		return justBig;
	}
}