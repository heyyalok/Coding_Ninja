package lecture_11;

//import Lecture_08.Node;

//import java.util.LinkedList;
//import java.util.Queue;
class Node<T>
{
	T data;
	Node<T> next;
	public Node(T data) 
	{
		this.data = data;
		next  = null;
	}
}
public class Queue_Using_LinkedList<T>
{
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public Queue_Using_LinkedList() 
	{
		front = null;
		rear = null;
		size = 0;
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			throw new QueueEmptyException();
		}	
		return front.data;
	}

	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);
		if(rear == null){
			front = newNode;
			rear = newNode;
		}else{
			rear.next = newNode;
			rear = newNode;
		}
		size++;

	}

	public T dequeue() throws QueueEmptyException{
		if(size == 0){
			throw new QueueEmptyException();
		}	
		
		T temp = front.data;
		front = front.next;
		if(size == 1){
			rear = null;
		}
		size--;
		
		return temp;
	}


}
