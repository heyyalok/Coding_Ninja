package lecture_01;

public class DynamicArray 
{
	private int data [];
	int nextIndex ;
	
	public DynamicArray() 
	{
	data = new int[5];
	nextIndex = 0;
	}
	public void add (int element) 
	{
		data [nextIndex]= element;
		nextIndex++;
		if (nextIndex == data.length)
		{
			restructure();
		}
	}
	private void restructure () 
	{
		int temp[] = data;
		data = new int [data.length * 2];
		for (int i = 0; i<temp.length ;i++) 
		{
			data [i]= temp [i];
		}
	}
	public int size ()
	{
		return nextIndex;
	}
	public void set(int index , int element) 
	{
		if (index > nextIndex) 
		{
			return;
		}
		if (index < nextIndex) 
		{
			data [index]= element;
		}
		else 
		{
			add (element);
		}
	}
	public int get(int index)
	{
		if (index <nextIndex) 
		{
			return data [index];
		}
		else 
		{
			return -1;
		}
	}
	
	public boolean isEmpty() 
	{
		if (size()== 0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	
	}
	public int removeLast() 
	{
		if (size() == 0) 
		{
			return -1;
		}
		else 
		{
			int z = data[nextIndex-1];
			data  [nextIndex -1] = 0;
			nextIndex --;
			return z;
			
		}
		
	}
}