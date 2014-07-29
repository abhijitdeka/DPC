package checkIfCousinNodes;

import utiltyClasses.TreeNode;

public class CheckIfCousinNodes {
	
	public static boolean checkNodes(TreeNode root,TreeNode a,TreeNode b)
	{
		if(root==null)
			return false;
		
		int aheight=getHeight(root,a,0);
		int bheight=getHeight(root,b,0);
		
		if(aheight!=bheight)
			return false;
		return !(ifSibling(root.leftChild,root,a,b)||ifSibling(root.rightChild, root, a, b));
	}
	
	public static boolean ifSibling(TreeNode node,TreeNode parent,TreeNode a,TreeNode b)
	{
		if(node==null)
			return false;
		if(node==a)
		{
			if(parent.leftChild==a)
			{
				if(parent.rightChild==b)
					return true;
				else
					return false;
			}
			else
			{
				if(parent.leftChild==b)
					return true;
				else
					return false;
			}
		}
		return ifSibling(node.leftChild, node, a, b)||ifSibling(node.rightChild, node, a, b);
	}
	public static int getHeight(TreeNode currentNode,TreeNode node,int height)
	{
		if(currentNode==null)
			return -1;
		
		if(currentNode==node)
			return height;
		
		return Math.max(getHeight(currentNode.leftChild, node, height+1),getHeight(currentNode.rightChild, node, height+1));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode one= new TreeNode(1);
		TreeNode two= new TreeNode(2);
		TreeNode three=new TreeNode(3);
		TreeNode four= new TreeNode(4);
		TreeNode five= new TreeNode(5);
		TreeNode six= new TreeNode(6);
		TreeNode seven= new TreeNode(7);
		TreeNode eight=new TreeNode(8);
		TreeNode nine= new TreeNode(9);
		TreeNode ten= new TreeNode(10);
		TreeNode ele= new TreeNode(11);
		
		one.leftChild=two;
		one.rightChild=three;
		
		two.leftChild=four;
		two.rightChild=five;
		
		three.leftChild=six;
		three.rightChild=seven;
		
		if(checkNodes(one,two,three))
		System.out.println("yes the nodes are cousins!!!");
		else
		System.out.println("No the nodes are not cousins");
	}

}
