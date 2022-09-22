package lecture_11;

public class Queue_using_dynamic_array
{
	private int data [];
	private int front;
	private int rear;
	private int size;
	
	
	public Queue_using_dynamic_array() 
	{
		data = new int [10];
		front = -1;
		rear = -1;
		size = 0;
	}
	int size () 
	{
		return size;
	}
	boolean isEmpty() 
	{
		return size == 0;
	}
	int front () throws QueueEmptyException
	{
		if (size == 0)
		{
			throw new QueueEmptyException();
		}
		return data [front];
	}
	int dequeue() throws QueueEmptyException
	{
		if (size == 0) 
		{
			throw new QueueEmptyException();
		}
		int temp = data [front];
		front = (front+1)%data.length;
		size = size -1;
		if (size == 0) 
		{
			front  = -1;
			rear = -1;
		}
		return temp;
	}
	void enqueue(int element) 
	{
		if (size == data.length) 
		{
			doubleCapacity();
		}
		if (size ==0) 
		{
			front = front+1;
		}
		rear = (rear+1)%data.length;
		data [rear]= element;
		size = size +1;
	}
	void doubleCapacity()
	{
		int temp[] = data;
		data = new int [temp.length * 2];
		int index  = 0;
		for (int i = front; i<temp.length ;i++) 
		{
			data [index] = temp [i];
			index ++;
		}
		for (int j  = 0; j<front ;j++)
		{
			data [index] = temp[j];
			index++;
		}
		front = 0;
		rear = temp.length-1;
	}
}