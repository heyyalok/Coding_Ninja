package lecture_18;

public class PriorityQueueUse {
	public static void main (String[]args) throws PriorityQueueEmptyException 
	{
		PriorityMinQueue pq = new PriorityMinQueue ();
		int array[] = {5,1,9,2,0};
		for(int i  = 0; i<array.length ;i++) 
		{
			pq.insert(array[i]);
		}
		while (! pq.isEmpty()) 
		{
			System.out.print(pq.removeMin() +" ");
		}
	}
}