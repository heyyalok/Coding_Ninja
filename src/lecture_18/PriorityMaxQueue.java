package lecture_18;
// max priority queue implementation
// this can also be called Maxheap sort
import java.util.ArrayList;
public class PriorityMaxQueue {
	ArrayList<Integer> heap;
	public PriorityMaxQueue() 
	{
		heap = new ArrayList<Integer>();
	}
	int size() 
	{
		return heap.size();
	}
	boolean isEmpty() 
	{
		return heap.size()==0;
	}
	int getMax() throws PriorityQueueEmptyException
	{
		if(isEmpty()) 
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
			 if(heap.get(childIndex) > heap.get(parentIndex)) 
			 {
				 int temp = heap.get(childIndex);
				 heap.set(childIndex,heap.get(parentIndex));
				 heap.set(parentIndex, temp);
				 childIndex = parentIndex;
				 parentIndex = (childIndex-1)/2;
			 }
			 else 
			 {
				 return;
			 }
		 }
	}
	int removeMax() throws PriorityQueueEmptyException
	{
		if(isEmpty()) 
		{
			throw new PriorityQueueEmptyException();
		}
		int answer = heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int index = 0;
		int maxIndex = index;
		int leftChild = 1;
		int rightChild = 2;
		
		while (leftChild < heap.size()) 
		{
			if(heap.get(leftChild)> heap.get(maxIndex)) 
			{
				maxIndex = leftChild;
			}
			if(rightChild<heap.size() && heap.get(rightChild) > heap.get(maxIndex)) 
			{
				maxIndex = rightChild;
			}
			if(index == maxIndex) 
			{
				break;
			}
			else 
			{
				int temp = heap.get(index);
				heap.set(index, heap.get(maxIndex));
				heap.set(maxIndex, temp);
				index = maxIndex;
				leftChild = (2 * index) +1;
				rightChild = (2 * index) + 2;
			}
		}
		return answer;
	}
}