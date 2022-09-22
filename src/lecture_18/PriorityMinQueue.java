package lecture_18;
import java.util.ArrayList;
// implementation of MinPriority Queue;
// Min heap sort;
public class PriorityMinQueue {
	ArrayList<Integer>heap;
	public PriorityMinQueue() 
	{
		heap = new ArrayList<Integer>();
	}
	
	int size() 
	{
		return heap.size();
	}
	
	boolean isEmpty() 
	{
		return heap.size() == 0;
	}
	
	int getMin() throws PriorityQueueEmptyException
	{
		if (isEmpty()) 
		{
			throw new PriorityQueueEmptyException();
		}
		return heap.get(0);
	}
	
	void insert(int element) 
	{
		heap.add(element);
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex-1)/2;
		while (childIndex > 0) 
		{
			if(heap.get(parentIndex)>heap.get(childIndex)) 
			{
				int temp = heap.get(childIndex);
				heap.set(childIndex , heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
			}
			else 
			{
				return ;
			}
		}
	}
	int removeMin() throws PriorityQueueEmptyException
	{
		if (isEmpty()) 
		{
			throw new PriorityQueueEmptyException();
		}
		
		int answer = heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int index = 0;
		int minIndex = index;
		int leftChild = 1;
		int rightChild = 2;
		
		
		while (leftChild < heap.size())
		{
			if (heap.get(minIndex) > heap.get(leftChild)) 
			{
				minIndex = leftChild;
			}
			if(rightChild < heap.size() && heap.get(minIndex) > heap.get(rightChild))
			{
				minIndex = rightChild;
			}
			if (index == minIndex) 
			{
				break;
			}
			else 
			{
				int temp = heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex,temp);
				index = minIndex;
				leftChild = (index * 2)+1;
				rightChild = (index * 2)+2;
			}
		}
		return answer;
	}
}