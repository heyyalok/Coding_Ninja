package lecture_12;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import lecture_11.QueueEmptyException;
import lecture_11.Queue_Using_LinkedList;
public class TreeUse {
	public static void main (String[]args) 
	{
//		TreeNode<Integer> root = new TreeNode<Integer>(4);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(5);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(6);
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node3.children.add(node4);
//		
//		System.out.print(root);
		//Scanner s = new Scanner (System.in);
		TreeNode<Integer>root = takeInput();
		print(root);
	}
	public static TreeNode<Integer>takeInput()
	{
		// taking input with the help of queue
		// i.e., taking input levelWise
		Scanner s = new Scanner (System.in);
		System.out.println("enter the root data ");
		int rootData = s.nextInt();
		TreeNode<Integer>root = new TreeNode<Integer>(rootData);
		Queue_Using_LinkedList<TreeNode<Integer>> pendingNode  = new Queue_Using_LinkedList<TreeNode<Integer>>();
		pendingNode.enqueue(root);
		
		while (!pendingNode.isEmpty()) 
		{
			try {
				TreeNode<Integer>frontNode = pendingNode.dequeue();
				System.out.println("how many children do you want for "+frontNode.data+" ");
				int childCount = s.nextInt();
				for (int i = 0;  i<childCount ;i++)
				{
					System.out.println("enter the data for"+(i+1)+"th childNode ");
					int childData = s.nextInt();
					TreeNode<Integer>childNode = new TreeNode<Integer>(childData);
					frontNode.children.add(childNode);
					pendingNode.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				return null;
			}
		}
		return root;
		
	}
	public static void preOrder(TreeNode<Integer>root)
	{
		
	}
//	private static TreeNode<Integer> takeInput(Scanner s)
//	{
//		// recursive function
//		int n ;
//		System.out.println("enter the data of root");
//		n = s.nextInt();
//		TreeNode<Integer>root = new TreeNode<Integer>(n);
//		System.out.println ("how many children do you want for "+n);
//		int childcount = s.nextInt();
//		for (int i = 0;  i<childcount;i++) 
//		{
//			TreeNode<Integer>child = takeInput(s);
//			root.children.add(child);
//		}
//		return root;
//	}
	
	
//	public static void print(TreeNode<Integer>root) 
//	{
//		// recursive function
//		String s = root.data + ":";
//		for (int i  = 0 ; i<root.children.size(); i++) 
//		{
//			s = s + root.children.get(i).data +",";
//		}
//		System.out.println(s);
//		for (int i = 0; i<root.children.size();i++) 
//		{
//			print(root.children.get(i));
//		}
//		 
//	}
	
	
	public static void print(TreeNode<Integer>root) 
	{
		// level Wise Print of Tree
		Queue <TreeNode<Integer>> mainQueue = new LinkedList<TreeNode<Integer>>();
		Queue <TreeNode<Integer>> childQueue = new LinkedList<TreeNode<Integer>>();
		mainQueue.add(root);
		
		while (!mainQueue.isEmpty()) 
		{
			TreeNode<Integer>frontNode = mainQueue.poll();
			System.out.print(frontNode.data+" ");
			
			for (int i  = 0; i<frontNode.children.size();i++)
			{
				childQueue.add(frontNode.children.get(i));
			}
			if (mainQueue.isEmpty()) 
			{
				System.out.println();
				mainQueue = childQueue;
				childQueue = new LinkedList<TreeNode<Integer>>();
			}
		}
	}
}