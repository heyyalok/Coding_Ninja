package Lecture_08;
import java.util.Scanner;

public class LinkedListUse 
{
	public static void main (String[]args)
	{
		//System.out.println("Insert elements");
		Node<Integer> head1 = takeInput();
		//Node<Integer> head2 = takeInput();
		//boolean result = isPalindrome(head1, head2 );
		//System.out.print(result);
		//Node<Integer> head1 = Insert (head, 5, 16);
//		try {
//			head1 = insert(head1, 80, 5);
//		} catch (LinkedListIndexOutOfBound e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		head1 = insertRecursive(head1, 80, 3);
		print(head1);
		//print(head1);
	}
//	static Node<Integer> takeInput()
//	{
//		System.out.println("Insert elements");
//		Node<Integer> head = null;
//		Scanner scr = new Scanner (System.in);
//		int data  = scr.nextInt();
//		while (data != -1) 
//		{
//			Node <Integer> newNode = new Node<Integer> (data);
//			if (head == null) 
//			{
//				head = newNode;
//			}
//			else 
//			{
//				Node<Integer> temp = head;
//				while (temp.next != null) 
//				{
//					temp = temp.next;
//				}
//				temp.next = newNode;
//			}
//			data = scr.nextInt();
//		}
//		return head;
//	}
	static Node<Integer> takeInput()
	{
		Node<Integer> head = null;
		Node<Integer> tail = null;
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the element: ");
		int data = scr.nextInt();
		while (data != -1) 
		{
			Node<Integer> newNode = new Node<Integer>(data);
			
			if (head == null) 
			{
				head = newNode;
				tail = newNode;
			}
			
			else 
			{
				tail.next = newNode;
				tail = tail.next;
			}
			
			data = scr.nextInt();
		}
		return head;
	}
	static void print (Node<Integer> head) 
	{
		Node<Integer>tail = head;
		while  (tail != null) 
		{
			System.out.print(tail.data+" ");
			tail = tail.next;
		}
		System.out.println();
	}
	static Node<Integer>insertRecursive(Node<Integer> head, int data, int pos)
	{
		if(pos == 0) 
		{
			Node<Integer>newNode = new Node<Integer>(data);
			newNode.next = head;
			return newNode ;
		}
		if (head== null) 
		{
			return null;
		}
		head.next = insertRecursive(head.next , data, pos-1);
		return head;
	}
	static Node<Integer> insert(Node<Integer>head, int data , int pos) throws LinkedListIndexOutOfBound
	{
		Node<Integer>newNode = new Node<Integer>(data);
		if (pos == 0)
			
		{
			newNode.next = head;
			head = newNode;
			return head;
		}
		
		int i  = 0;
		Node<Integer>tail = head;
		if (pos > i) 
		{
			throw new LinkedListIndexOutOfBound();
		}
		while ( i < pos - 1) 
		{
			tail = tail.next;
			i = i+1;
		}
		
		newNode.next = tail.next;
		tail.next = newNode;
		//return head;
		return head;
	}
	public static boolean isPalindrome(Node<Integer> head1, Node<Integer>head2) 
    {
		//Your code goes here
        if (head1 == null || head1.next == null  && head2 == null || head2.next == null)
        {
            return true;
        }
//        Node<Integer> temp = head;
//        int count = 0;
//        while (temp != null)
//        {
//            temp = temp.next;
//            count = count + 1;
//        }
//        Node<Integer> temp1 = head;
//        Node<Integer> head2 = null;
//        //de<Integer> head2 = null;
//        int position = count;
//        while (position > 0)
//        {
//            count = 0;
//            while (count < position -1)
//            {
//                temp1 = temp1.next;
//                count = count + 1;
//            }
//            if (head2 == null )
//            {
//                head2 =temp1;
//            }
//            else
//            {
//                while (head2.next != null)
//                {
//                head2.next = temp1;    
//                }
//                //head2 = temp1;
//            }
//            //ad2.next = temp1;
//            temp1 = head;
//            position = position -1;
//        }
//        //print(head);
//        print(head2);
        Node<Integer> temp3 = head1;
        Node<Integer> temp4 = head2;
        
        while (temp3.next!= null && temp4.next != null)
        {
        	
        	
        	 if (temp3.data != temp4.data)
            {
                return false;
            }
            else
            {
//            	if (temp3 == null && temp4 != null) 
//            	{
//            		return false;
//            	}
//            	else if (temp4 == null && temp3 != null) 
//            	{
//            		return false;
//            	}
                temp3 = temp3.next;
                temp4 = temp4.next;
            }
        }
        return true;
	}
//	static Node <Integer> Insert (Node<Integer> head, int position, int data)
//	{
//		Node<Integer> newNode = new  Node<Integer> (data);
//		if (position == 0) 
//		{
//			newNode.next = head;
//			return newNode;
//		}
//		Node<Integer> temp = head;
//		int count = 0;
//		while (count < position -1) 
//		{
//			temp = temp.next;
//			count  = count+1;
//		}
//		newNode.next = temp.next;
//		temp.next = newNode;
//		return head;
		// test case fails when we have element of size 4 and we try to insert at 6 
		// i.e., if we want to insert element at a position which is not in the list then this program/function fails.
 //}
}
