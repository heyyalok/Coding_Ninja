package lecture_17;
import lecture_17.LinkedListHashNode;
public class HashMap<K , V > 
{
	private LinkedListHashNode<K, V >head;
	//private LinkedListHashNode<K, V >tail;
	private LinkedListHashNode<K, V >temp;
	private int size = 0;

	//LinkedListHashNode<K ,V> list = new LinkedListHashNode<K , V>(null, null);
	void insertInMap(K key , V value)
	{
		LinkedListHashNode<K ,V> newNode = new LinkedListHashNode<K , V>(key, value);
//		if (head == null) 
//		{
//			head = newNode;
//			//tail = newNode;
//		}
		temp = head;
		while (temp != null) 
		{
			if(key.equals(temp.key)) 
			{
				temp.key = key;
				temp.value = value;
				//size++;
				return;
			}
			temp = temp.next;
		}
		if (head == null) 
		{
			head = newNode;
			//tail = newNode;
		}
		else 
		{
			newNode.next = head;
			head = newNode;
			//tail.next = newNode;
			//tail = tail.next;
		}
		size++;
	}
	int size() 
	{
		return size;
	}
	boolean containsKey(K key) throws HashMapEmptyException
	{
		if (size == 0) 
		{
			throw new HashMapEmptyException(); 
		}
		LinkedListHashNode <K , V> temp = head;
		while (temp != null) 
		{
			if (temp.key.equals(key)) 
			{
				return true;
			}
			temp = temp.next;
		}
		// restoring the temp to head
		// just because we want our temp to be return back to 
		//the head after the every function
		temp = head;
		return false;
	}
	V getValue(K key) throws HashMapEmptyException 
	{
		temp = head;
		while (temp != null) 
		{
			if(temp.key.equals(key)) 
			{
				return temp.value;
			}
			temp = temp.next;
		}
		throw new HashMapEmptyException();
	}
//	int v =  0;
//	if (map.containsKey(k key)) 
//	{
//		v = 
//	}
	
     void print (HashMap<K, V >map) 
     {
    	 temp = map.head;
    	 while (temp != null)
    	 {
    		 System.out.println(temp.value +" "+ temp.key);
    		 temp = temp.next;
    	 }
    	 temp  = head;
     }
     LinkedListHashNode<K , V > delete(K key, V value) 
     // didn't get to the point
     {
 
    	 temp = head;
    	 while (temp.next!= null) 
    	 {
    		 if (key.equals(temp.key) && value.equals(temp.value)) 
    		 {
    			 temp = temp.next.next;
    		 }
    		 temp = temp.next;
    	 }
    	 return head;
     }
	
}