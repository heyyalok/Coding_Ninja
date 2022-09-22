package lecture_10;

public class StackUsingArray {
	private int data[];
	private int top;
	
	public StackUsingArray() 
	{
		data = new int [10];
		top = -1;
	}
	public StackUsingArray(int capacity_of_stack)
	{
		data = new int [capacity_of_stack];
		top = -1;
	}
	public boolean isEmpty () // to check weather the stack is empty or not
	{
		return (top == -1);
	}
	public int size () // to find the size of stack
	{
		return top +1;
	}
	public int top () throws StackEmptyException // which element is at the top of stack
	{
		if (size () == 0)
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data [top];
	}
	public void push (int element) throws StackFullException // adding element in the stack
	{
		if (size() == data.length) 
		{
			StackFullException e = new StackFullException();
			throw e;
		}
		top ++;
		data [top] = element;
	}
	public int pop () throws StackEmptyException /// deleting element from the stack
	{
		if (size () == 0) 
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		
		int temp = data[top];
		top --;
		//int temp = data[top];
		return temp;
	}
}