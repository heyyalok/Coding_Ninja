package Lecture_08;

public class Node <T>
{
	T data;
	Node<Integer> next;
	
	Node (T data) 
	{
		this.data = data;
		next=  null;
	}
}