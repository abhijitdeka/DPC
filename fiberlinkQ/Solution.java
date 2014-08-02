package fiberlinkQ;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	 static int isPerfectString(String input) {
	        
	     //int ret=0;
	     
	     for(int i=1;i<input.length()-1;i++)
	     {
	    	 Map<String,Boolean>map= new HashMap<String,Boolean>();
	    	 for(int j=0;j<input.length()-i;j++)
	    	 {
	    		 String newString="";
	    		 newString+=input.charAt(j);
	    		 newString+=input.charAt(i+j);
	    		 //System.out.println(newString);
	    		 if(map.containsKey(newString))
	    			 return 0;
	    		 else
	    			 map.put(newString,Boolean.TRUE);
	    		 
	    	 }
	     }
	     
	     return 1;
		 

	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="R";
		System.out.println(isPerfectString(input));

	}

}
