


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		
		try {
		// TODO Auto-generated method stub
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line="";
		String[] arrayOfString;
		
		
		//if(stdin.readLine()!=null)
		line = stdin.readLine();
       // System.out.println(line);
		
		arrayOfString= line.split(" ");
		int noOfLanes=Integer.parseInt(arrayOfString[0]);
		int noOfTestCases=Integer.parseInt(arrayOfString[1]);
            
        arrayOfString=null;
        line = stdin.readLine();
        arrayOfString= line.split(" ");    
		ArrayList<Integer> laneWidths=new ArrayList<Integer>();
		
        
		for(int i=0;i<noOfLanes;i++)
		{
			laneWidths.add(Integer.parseInt(arrayOfString[i]));
		}
		//System.out.println(laneWidths);
       
            while ((line = stdin.readLine()) != null && line.length()!= 0) {
                String[] input = line.split(" ");
                if (input.length == 2) {
                    // Solution.algo(Integer.parseInt(input[0]),Integer.parseInt(input[1]),laneWidths);
                  }
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
		
		System.out.println(min);
		return min;
	}

}
