package ModifiedBinarySearch;
/*Given an array which is sorted, but after sorting some elements are moved to either of the adjacent positions, i.e., arr[i] may be present at arr[i+1] or arr[i-1]. Write an efficient function to search an element in this array. Basically the element arr[i] can only be swapped with either arr[i+1] or arr[i-1].

For example consider the array {2, 3, 10, 4, 40}, 4 is moved to next position and 10 is moved to previous position.

Example:

Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 40
Output: 2 
Output is index of 40 in given array

Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 90
Output: -1
-1 is returned to indicate element is not present

http://www.geeksforgeeks.org/search-almost-sorted-array/
 * 
 * */
public class ModifiedBinarySearch {

	public static boolean binarySearch(int array[],int low,int high,int no)
	{
		if(low<high)
		{
			int mid=low+(high-low)/2;
			if(array[mid]==no ) 
			{
				System.out.println("found @ position"+mid);
				return true;
			} 
			if(low<mid && array[mid-1]==no)
			{
				System.out.println("found @ position"+(mid-1));
				return true;
			}
			if(high>mid && array[mid+1]==no)
			{
				System.out.println("found @ position"+(mid+1));
				return true;
			}
			
			if(array[mid]>no)
				return binarySearch(array, low, mid-2, no);
			else
				return binarySearch(array, mid+2, high, no);
			
		}
		System.out.println("NOT FOUND !!!");
		return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]={10, 3, 40, 20, 50, 80, 70};
		binarySearch(array,0,array.length-1,70);
		

	}

}
