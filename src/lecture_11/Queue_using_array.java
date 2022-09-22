package lecture_11;

public class Queue_using_array {
	
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public Queue_using_array() 
	{
		data = new int [10];
		front = -1;
		rear = -1;
		size = 0;
	}
	public Queue_using_array(int capacity) 
	{
		data = new int [capacity];
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
		return (size == 0);
	}
	int front () throws QueueEmptyException
	{
		if (size == 0) 
		{
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		return data [front];
	}
	void enqueue (int element) throws QueueFullException
	{
		if (size == data.length) 
		{
			QueueFullException e = new QueueFullException();
			throw e;
		}
		if (size == 0) 
		{
			front ++;
		}
//		rear ++;
//		data [rear] = element;
//		size ++;
		rear  = (rear + 1) % data.length;// this define the range of rear i.ie., rear will 
		// only vary between 0 to data.lenghth - 1
		data [rear]= element;
		size++;
	}
	int dequeue () throws QueueEmptyException
	{
		if (size == 0) 
		{
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		int temp = data[front];
		front = (front+1) % data.length;
		size--;
		if (size == 0) // empty queue 
		{
			rear = -1;// reset the rear and front
			front = -1;
		}
		return temp;
	}
}