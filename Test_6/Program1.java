// Q.1) Print unique unsorted array Accept data in an array having duplicate value. You need to print unique array using only 2 loop . Input 3, 5, 3, 7, 9, 7, 3, 1 output1,3, 5,7,9 

package Test;

import java.util.Arrays;

public class UniqueUnsortedArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {3,5,3,7,9,7,3,1};
		
		int uniqueArr[]=getUniqueArray(arr);
		Arrays.sort(uniqueArr);
		System.out.println(Arrays.toString(uniqueArr));

	}

	private static int[] getUniqueArray(int arr[]) 
	{
	   int temp[] =new int[arr.length];
	   int count=0;
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   boolean isDuplicate=false;
		   for(int j=0;j<count;j++)
		   {
			   if(arr[i]==temp[j]) 
			   {
				   isDuplicate=true;
				   break;
			   }
		   }
		   if(!isDuplicate)
		   {
			   temp[count]=arr[i];
			   count++;
		   }
			   
	   }
	   
		return Arrays.copyOf(temp, count);
	}

}
