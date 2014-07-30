package findInOrderPreAndSuc;

import java.awt.TextArea;

import utiltyClasses.TreeNode;

public class InorderPreAndSucc {

	public static TreeNode pre;
	public static TreeNode succ;
	/**
	 * @param args
	 */
	
	public static void findPreAndSucc(TreeNode currentNode,int nodeval)//,TreeNode pre,TreeNode succ)
	{
		if(currentNode==null)
			return;
		if(currentNode.val==nodeval)
		{
			if(currentNode.leftChild!=null)
			{
				pre=currentNode.leftChild;
				TreeNode temp=currentNode.leftChild;
				while(temp.rightChild!=null)
				{
					pre=temp;
					temp=temp.rightChild;
				}
			}
			
			if(currentNode.rightChild!=null)
			{
				succ=currentNode.rightChild;
				TreeNode temp=currentNode.rightChild;
				while(temp.leftChild!=null)
				{
					succ=temp;
					temp=temp.leftChild;
					
				}
			}
		}
		
		else if(currentNode.val<nodeval)
		{
			pre=currentNode;
			findPreAndSucc(currentNode.rightChild, nodeval);
		}
		else 
		{
			succ=currentNode;
			findPreAndSucc(currentNode.leftChild, nodeval);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode one= new TreeNode(1);
		TreeNode two= new TreeNode(2);
		TreeNode three=new TreeNode(3);
		TreeNode four= new TreeNode(4);
		TreeNode five= new TreeNode(5);
		TreeNode six= new TreeNode(6);
		TreeNode seven= new TreeNode(7);
		TreeNode eight= new TreeNode(8);
		
		four.leftChild=two;
		four.rightChild=six;
		
		two.leftChild=one;
		two.rightChild=three;
		
		six.leftChild=five;
		six.rightChild=eight;
		
		
		
		
		findPreAndSucc(four, 7);
		
		System.out.println("Predessor="+pre.val);
		System.out.println("Successor="+succ.val);
	}

}
