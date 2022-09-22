package lecture_12;
//import lecture_12.TreeNode;
public class nodeWithLargestData {
	public static int largestNode(TreeNode<Integer>root)
	{
		int data = root.data;
		for (int i  = 0; i<root.children.size(); i++) 
		{
			int smallData = largestNode(root.children.get(i));
			if (smallData > data) 
			{
				data  = smallData;
			}
		}
		return data;
	}
	public static void main (String [] args)
	{
		TreeNode<Integer>root = TreeUse.takeInput();
		TreeUse.print(root);
		//System.out.println("break line");
		int largestNode = largestNode(root);
		System.out.print("largest NodeData is "+largestNode);
	}

}
