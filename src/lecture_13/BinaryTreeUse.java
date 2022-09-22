package lecture_13;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeUse {
	public static void main (String[]args) 
	{
		Scanner scr = new Scanner(System.in);
		BinaryTreeNode<Integer>root = takeInputLL();
		ldr(root);
		lrd(root);
		dlr(root);
		drl(root);
		rdl(root);
		rld(root);
		//printInOrder(root);
		//printLL(root);
		//System.out.println("height of the tree is "+heightDiameter(root).height);
		//System.out.print("diameter of the tree is "+heightDiameter(root).diameter);
//		BinaryTreeNode<Integer>root = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer>child1 = new BinaryTreeNode<Integer>(3);
//		BinaryTreeNode<Integer>child2 = new BinaryTreeNode<Integer>(4);
//		
//		root.left = child1;
//		root.right = child2;
	}
	public static BinaryTreeNode<Integer> takeInput (Scanner s)
	{
		// recursive input
		System.out.println("enter the root value");
		int rootValue = s.nextInt();
		//BinaryTreeNode<Integer>root = new BinaryTreeNode<Integer>(rootValue);
		
		if (rootValue == -1) 
		{
			return  null;
		}
		BinaryTreeNode<Integer>root = new BinaryTreeNode<Integer>(rootValue);
		root.left= takeInput(s);
		root.right = takeInput(s);
		
		return root;
	}
	public static BinaryTreeNode<Integer>takeInputLL()
	{
		// level wise input
		Scanner scr = new Scanner (System.in);
		System.out.print("enter the root data ");
		int rootData = scr.nextInt();
		if (rootData ==-1)
		{
			return null;
		}
		BinaryTreeNode<Integer>root = new BinaryTreeNode<Integer>(rootData);
		Queue <BinaryTreeNode<Integer>>q = new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		while (!q.isEmpty()) 
		{
			BinaryTreeNode<Integer>frontNode = q.poll();
			System.out.print("enter the left node data of "+frontNode.data+" ");
			int leftNodeData = scr.nextInt();
			if (leftNodeData!=-1) 
			{
				BinaryTreeNode<Integer>leftNode = new BinaryTreeNode<Integer>(leftNodeData);
				frontNode.left = leftNode;
				q.add(leftNode);
			}
			
			System.out.print("enter the right node data of "+frontNode.data+" ");
			int rightNodeData = scr.nextInt();
			if (rightNodeData!=-1) 
			{
				BinaryTreeNode<Integer>rightNode = new BinaryTreeNode<Integer>(rightNodeData);
				frontNode.right = rightNode;
				q.add(rightNode);
			}
		}
		return root;
	}
	public static void print(BinaryTreeNode<Integer>root) 
	{
		// recursive printing
		if (root == null) 
		{
			return ;
		}
		String result = root.data+":";
		if (root.left!= null) 
		{
			result = result +"L:"+ root.left.data+",";
		}
		if (root.left== null) 
		{
			result = result +"L:-1,";
		}
		if (root.right != null) 
		{
			result = result +"R:"+ root.right.data;
		}
		if (root.right == null) 
		{
			result = result +"R:-1";
		}
		System.out.println(result);
		print(root.left);
		print (root.right);	
	}
	public static void printLL(BinaryTreeNode<Integer>root) 
	{
		if (root == null) 
		{
			return;
		}
		Queue<BinaryTreeNode<Integer>>mainQueue= new LinkedList<BinaryTreeNode<Integer>>();
		Queue<BinaryTreeNode<Integer>>childQueue= new LinkedList<BinaryTreeNode<Integer>>();
		mainQueue.add(root);
		while (!mainQueue.isEmpty()) 
		{
			BinaryTreeNode<Integer>frontNode = mainQueue.poll();
			String result = frontNode.data+":";
			if (frontNode.left != null) 
			{
				childQueue.add(frontNode.left);
				result = result +  "L:"+frontNode.left.data+",";
			}
			if (frontNode.right != null) 
			{
				childQueue.add(frontNode.right);
				result = result + "R:"+frontNode.right.data;
			}
			if (frontNode.left == null) 
			{
				result = result + "L:-1,";
			}
			if (frontNode.right == null) 
			{
				result = result + "R:-1";
			}
			System.out.println(result);
			if (mainQueue.isEmpty()) 
			{
				mainQueue = childQueue;
				childQueue = new LinkedList<BinaryTreeNode<Integer>>();
			}
		}
	}
	public static int height(BinaryTreeNode<Integer>root) 
	{
		if (root == null) 
		{
			return 0;
		}
		//int count = 0;
		return Math.max(height(root.left), height(root.right))+1;
	}
	public static Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer>root) 
	{
		if (root == null) 
		{
			Pair<Integer,Integer>result = new Pair<Integer,Integer>();
			result.height = 0;
			result.diameter = 0;
			return result;
		}
		Pair<Integer,Integer>leftOutput = heightDiameter (root.left);
		Pair<Integer,Integer>rightOutput = heightDiameter(root.right);
		
		
		int height = 1+Math.max(leftOutput.height, rightOutput.height);
		int diameterOption1 = leftOutput.height + rightOutput.height;
		int diameterOption2 = leftOutput.diameter;
		int diameterOption3 = rightOutput.diameter;
		
		int diameter = 1+Math.max(diameterOption1, Math.max(diameterOption2, diameterOption3));
		
		Pair<Integer,Integer>result = new Pair<Integer, Integer>();
		result.height = height;
		result.diameter = diameter;
		
		return result;
	}
	public static void  printInOrder(BinaryTreeNode<Integer>root) 
	{
		if (root == null) 
		{
			return;
		}
		printInOrder(root.left);
		System.out.print(root.data+",");
		printInOrder(root.right);
	}
	public static void ldr(BinaryTreeNode<Integer>root) 
	{
		if (root == null) 
		{
			return;
		}
		ldr(root.left);
		System.out.print(root.data+" ");
		ldr(root.right);
		System.out.println();
	}
	public static void lrd(BinaryTreeNode<Integer>root) 
	{
		if(root == null) 
		{
			return ;
		}
		lrd(root.left);
		lrd(root.right);
		System.out.print(root.data+" ");
		System.out.println();
	}
	public static void dlr(BinaryTreeNode<Integer>root) 
	{
		if (root == null) 
		{
			return ;
		}
		System.out.print(root.data+" ");
		dlr(root.left);
		dlr(root.right);
		System.out.println();
	}
	public static void drl(BinaryTreeNode<Integer>root) 
	{
		if (root == null) 
		{
			return ;
		}
		System.out.print(root.data+" ");
		drl(root.right);
		drl(root.left);
		System.out.println();
	}
	public static void rdl(BinaryTreeNode<Integer>root) 
	{
		if (root == null) 
		{
			return ;
		}
		rdl(root.right);
		System.out.print(root.data+" ");
		rdl(root.left);
		System.out.println();
	}
	public static void rld(BinaryTreeNode<Integer>root) 
	{
		if (root == null) 
		{
			return ;
		}
		rld(root.right);
		rld(root.left);
		System.out.print(root.data);
		System.out.println();
	}
}