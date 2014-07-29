package checkIfSubTree;

import utiltyClasses.TreeNode;

public class CheckIfSubTree {

	public static boolean ifSubTree(TreeNode a,TreeNode b)
	{
		if(a==null || b==null)
			return false;
		StringBuilder PreorderOfA=new StringBuilder();
		StringBuilder PreoderOfB= new StringBuilder();
		StringBuilder InorderOfA= new StringBuilder();
		StringBuilder InorderOfB=new StringBuilder();
		
		preorderTraversal(a,PreorderOfA);
		preorderTraversal(b,PreoderOfB);
		
		inoderTraversal(a,InorderOfA);
		inoderTraversal(b,InorderOfB);
		
		System.out.println(PreorderOfA);
		System.out.println(PreoderOfB);
		System.out.println(InorderOfA);
		System.out.println(InorderOfB);
		
		if(PreorderOfA.toString().contains(PreoderOfB)&&InorderOfA.toString().contains(InorderOfB))
			return true;
		else 
			return false;
		
		
		
	}
	
	public static void preorderTraversal(TreeNode root,StringBuilder preorder)
	{
		if(root==null)
			return;
		preorder.append(root.val);
		preorderTraversal(root.leftChild, preorder);
		preorderTraversal(root.rightChild, preorder);
	}
	
	public static void inoderTraversal(TreeNode root,StringBuilder inorder)
	{
		if(root==null)
			return;
		preorderTraversal(root.leftChild, inorder);
		inorder.append(root.val);
		preorderTraversal(root.rightChild, inorder);
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
		
		one.leftChild=two;
		one.rightChild=three;
		
		two.leftChild=four;
		two.rightChild=five;
		
		three.leftChild=six;
		three.rightChild=seven;
		
		
		TreeNode oneAgain=new TreeNode(1);
		TreeNode twoAgain= new TreeNode(2);
		TreeNode fourAgain= new TreeNode(4);
		TreeNode fiveAgain= new TreeNode(5);
		
		oneAgain.leftChild=twoAgain;
		twoAgain.leftChild=fourAgain;
		twoAgain.rightChild=fiveAgain;
		
		if(ifSubTree(one, oneAgain))
			System.out.println("They are subtree !!");
		else
			System.out.println("No they are not subtree");

	}

}
