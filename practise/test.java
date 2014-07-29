package practise;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		
		try {
		// TODO Auto-generated method stub
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] firstline;
		
		
		//if(stdin.readLine()!=null)
		//line = stdin.readLine();
		
		firstline= args[0].split(" ");
		int noOfLanes=Integer.parseInt(args[0]);
		int noOfTestCases=Integer.parseInt(args[1]);
		ArrayList<Integer> laneWidths=new ArrayList<Integer>();
		
		for(int i=2;i<=noOfLanes+1;i++)
		{
			laneWidths.add(Integer.parseInt(args[i]));
		}
		
		for(int i=noOfLanes+2;i<args.length;i=i+2)
		{
			algo(Integer.parseInt(args[i]),Integer.parseInt(args[i+1]),laneWidths);
		}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static int algo(int firstLane,int secondLane,ArrayList<Integer>laneWidth)
	{
		if(firstLane<0 && secondLane<0)
			return -1;
		int min=3;
		for(int i=firstLane;i<=secondLane;i++)
		{
			if(min>laneWidth.get(i))
				min=laneWidth.get(i);
		}
		
		System.out.println(min+"\n");
		return min;
	}

}
