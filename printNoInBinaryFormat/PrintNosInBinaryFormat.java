package printNoInBinaryFormat;

import java.util.LinkedList;
import java.util.Queue;

public class PrintNosInBinaryFormat {

	public static void printNos(int start,int end)
	{
		if(start==0)
			System.out.println("0");
		start++;
		String binaryString=toBinaryString(start);
		
		Queue<String>queue=new LinkedList<>()  ;
		queue.add(binaryString);
		int count=start;
		while(!queue.isEmpty() && count<=end)
		{
			String front=queue.remove();
			System.out.println(front);
			queue.add(front+"0");
			queue.add(front+"1");
			count++;
		}
		
		
	}
	
	public static String toBinaryString(int no)
	{
		if(no==0)
			return "0";
		StringBuilder noString=new StringBuilder();
		while(no!=0)
		{
			if((no & 1)==1)
				noString.append("1");
			else
				noString.append("0");
			no=no>>1;
			
		}
		
		return noString.reverse().toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start=0;
		int end=1024;
		printNos(start,end);

	}

}
