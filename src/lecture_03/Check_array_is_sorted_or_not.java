package lecture_03;

public class Check_array_is_sorted_or_not {
	public static boolean checksorted (int []array ) 
	{
		if  (array.length <= 1)// we will only count to index at 1st position 
		{
			return true;
		}
		int smallinput []= new int [array.length-1];
		for (int i = 1 ; i <array.length ;i++) 
		{
			smallinput [i-1]= array [i];
		}
		boolean smallvalue  = checksorted (smallinput);
		if (!smallvalue) 
		{
			return  false ;
			
		}
		if  (array [0]<= array [1])
		{
			return true;
		}
		else 
		{
			return false;			
		}
	}
	public static void main (String[]args) 
	{
		int [] array = {2,3,4,6,1};
		boolean result = checksorted (array);
		System.out.print (result);
	}
}