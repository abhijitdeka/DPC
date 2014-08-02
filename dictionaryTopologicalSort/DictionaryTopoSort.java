package dictionaryTopologicalSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class DictionaryTopoSort {
	
	public static List<List<Character>> adjList;
	public static Map<Character,Boolean>isVisited;
	public static void findOrder(List<String>dictionary,char[]alphabate)
	{
		createGraph(dictionary,alphabate);
		topologicalSort(dictionary,alphabate);
		
	}

	public static void createGraph(List<String>dictionary,char[]alphabate)
	{
		if(dictionary==null ||alphabate==null)
		{
			System.out.println("invalid inputs");
			return;
		}
		
		for(int i=0;i<alphabate.length;i++)
		{
			List<Character> temp= new ArrayList<Character>();
			adjList.add(temp);
		}
		
		for(int i=0;i<dictionary.size()-1;i++)
		{
			String currentString=dictionary.get(i);
			String nextString=dictionary.get(i+1);
			for(int j=0;j<currentString.length() && j<nextString.length();j++)
			{
				if(currentString.charAt(j)!=nextString.charAt(j))
				{
					//char a=.charAt(j);
					//String temp=alphabate.toString();
					int indexOfFirst=String.copyValueOf(alphabate).indexOf(currentString.charAt(j));
					int indexOfSecond=alphabate.toString().indexOf(nextString.charAt(j));
					adjList.get(indexOfFirst).add(nextString.charAt(j));
					break;
				}
			}
			
			
		}
		
		return;			
	}
	
	public static void topologicalSort(List<String>dictionary,char[]alphabate)
	{
		Stack<Character> stack = new Stack<Character>();
		
		isVisited= new HashMap<Character,Boolean>();
		stack.push(dictionary.get(0).charAt(0));
		//isVisited.put(dictionary.get(0).charAt(0), Boolean.TRUE);
		while(!stack.isEmpty())
		{
			char top=stack.pop();
			System.out.println(top);
			int adjIndex=String.valueOf(alphabate).indexOf(top);
			List<Character>list=adjList.get(adjIndex);
			for(Character c:list)
			{
				
				if(!isVisited.containsKey(c))
				{
					isVisited.put(c, Boolean.TRUE);
					stack.push(c);
				}
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> dictionary= new ArrayList<String>();
		dictionary.add("caa");
		dictionary.add("aaa");
		dictionary.add("aab");
		//dictionary.add("cab");
		//dictionary.add("cad");
		
		adjList=new ArrayList<List<Character>>();//[];
		char[] alphabate={'a','b','c'};//,'d'};
		findOrder(dictionary,alphabate);
	}

}
