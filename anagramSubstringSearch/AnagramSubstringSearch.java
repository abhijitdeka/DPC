package anagramSubstringSearch;

public class AnagramSubstringSearch {

	/**
	 * @param args
	 */
	public static int[]needsToFind;
	public static int[]hasFound;
	public static void search(String txt,String pattern)
	{
		needsToFind=new int[256];
		hasFound=new int[256];
		
		int count=0;
		for(int i=0;i<pattern.length();i++)
		{
			needsToFind[pattern.charAt(i)]++;
			
		}
		
		/*if(count==pattern.length())
		{
			System.out.println("found @"+0);
		}*/
		int patlength=pattern.length();
		for(int i=0;i<txt.length();i++)
		{
			char currentChar=txt.charAt(i);
			//System.out.println("current"+currentChar);
			if(i>=patlength)
			{
				if(needsToFind[txt.charAt(i-(patlength))]!=0)
				{
					char removed=txt.charAt(i-(patlength));
					//System.out.println("removed"+removed);
					if(hasFound[txt.charAt(i-(patlength))]<=needsToFind[txt.charAt(i-(patlength))])
						count--;
						
					hasFound[txt.charAt(i-(patlength))]--;
					
				}
			}
			
			if(needsToFind[txt.charAt(i)]!=0)
			{
				if(needsToFind[txt.charAt(i)]>hasFound[txt.charAt(i)])
					count++;
				hasFound[txt.charAt(i)]++;
			}
			//else
				//continue;
			
			if(count==patlength)
			{
				System.out.println("Found @"+(i-(patlength-1)));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt="AAABABAA";
		String pattern="AABA";
		search(txt,pattern);

	}

}
