package lecture_10;
import java.util.*;

public class StackUse
{
	public static void main (String args []) throws StackFullException 
	{
		Scanner scr = new Scanner (System.in);
		//StackUsingArray stack = new StackUsingArray();
		StackUsingDynamicArray stack = new StackUsingDynamicArray();
		
		System.out.println(stack.isEmpty());
		for (int i = 0; i< 8 ;i++)
		{
			stack.push(scr.nextInt());
		}
		// at this time our stack is having 20 elements so output will be false;
		System.out.println(stack.isEmpty());
		
		while (!stack.isEmpty()) 
		{
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// till this time our stack have poped out all the element so output will be true 
		System.out.println(stack.isEmpty());
	}
}