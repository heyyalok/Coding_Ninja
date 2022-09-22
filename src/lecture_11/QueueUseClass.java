package lecture_11;

public class QueueUseClass
{
	public static void main (String[]args) throws QueueFullException, QueueEmptyException 
	{
		//Queue_using_array newQueues = new Queue_using_array(5);
		Queue_using_dynamic_array newQueues = new Queue_using_dynamic_array();
//		
//		newQueues.enqueue(10);
//		newQueues.enqueue(20);
//		newQueues.enqueue(30);
//		newQueues.enqueue(40);
//		newQueues.enqueue(50);
//		
//		
//		
//		System.out.println(newQueues.front());
//		
//		
//		
//		newQueues.dequeue();// delets 10
//		newQueues.dequeue();// delets 20
//		newQueues.dequeue();// delets 30
//		newQueues.dequeue();// delets 40
//		//newQueues.Dequeue();
//		
//		// till this time our queue have only 50 .
//			System.out.println(newQueues.front());
		
		
		
		for (int  i = 0; i<30; i++) 
		{
			newQueues.enqueue(i);
		}
		
		System.out.println(newQueues.isEmpty());
		
		while ( !newQueues.isEmpty())
		{
		  System.out.println(newQueues.dequeue());
		}
		
		System.out.print(newQueues.isEmpty());
	}
}