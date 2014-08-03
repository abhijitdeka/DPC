package kmpImplemetation;

public class KMPImplemenation {

	/**
	 * @param args
	 */
	public static int [] lps;
	public static void searchKMP(String text,String pattern)
	{
		preprocees(text);
		search(text,pattern);
		
	}
	
	public static void search(String txt,String pattern)
	{
		int i=0,j=0;
		while(i<txt.length())
		{
			if(txt.charAt(i)==pattern.charAt(j))
			{
				if(j==pattern.length()-1)
				{
					System.out.println("Pattern match found @"+(i-j));
					j=lps[j-1];
					i++;
				}
				else
				{
					i++;
					j++;
				}
			}
			else
			{
				if(j==0)
				{
					i++;
				}
				else
				{
					j=lps[j-1];
				}
				
			}
		}
	}
	public static void preprocees(String pattern)
	{
		lps=new int[pattern.length()];
		lps[0]=0;
		int len=0;
		int i=1;
		while(i<pattern.length())
		{
			if(pattern.charAt(i)==pattern.charAt(len))
			{
				len++;
				lps[i]=len;
				i++;
				
			}
			else
			{
				if(len==0)
				{
					lps[i]=0;
					i++;
				}
				else
				{
					len=lps[len-1];
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="THIS IS A TEST TEXT";
		String pattern="TEST";
		searchKMP(text,pattern);
	}

}
