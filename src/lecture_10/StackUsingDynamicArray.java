package lecture_10;
public class StackUsingDynamicArray
{
	private int data [];
	private int top;
	
	public StackUsingDynamicArray() 
	{
		data = new int[4];
		top = -1;
	}
	public StackUsingDynamicArray(int capacity) 
	{
		data = new int [capacity];
		top = -1;
	}
	public boolean isEmpty() 
	{
		return (top == -1);
	}
	public int size() 
	{
		return top +1;
	}
	public int top() throws StackEmptyException 
	{
		if (size() == 0)
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	public void push(int element) //throws StackFullException 
	{
		if (size () == data.length) 
		{
			int newArray[] = new int [data.length * 2];
			
			for (int i = 0; i<data.length ;i++)
			{
				newArray [i] = data [i];
			}
			top++;
			newArray[top] = element;
			
			data = newArray;
//			StackFullException e = new StackFullException();
//			throw e;
		}
		else {
		top ++;
		data [top]= element;}
	}
	public int pop() throws StackEmptyException 
	{
		if (size () == 0) 
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int element = data [top];
		top--;
		return element;
	}
}