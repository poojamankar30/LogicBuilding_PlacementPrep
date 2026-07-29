// Q.2)  Rearrange an array in maximum minimum form using Two Pointer Technique Given a sorted array of positive integers,
// rearrange the array alternately i.e first element should be a maximum value, at second position minimum value, 
// at third position second max, at fourth position second min, and so on. 
// Examples:  Input: arr[] = {1, 2, 3, 4, 5, 6, 7}  Output: arr[] = {7, 1, 6, 2, 5, 3, 4} Output: arr[] = {6, 1, 5, 2, 4, 3}  

package Test;

public class MaxMinFromArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7};
		int n =arr.length;
		System.out.print("Original Array :-  ");
		
		for(int i=0;i<n;i++) 
			{
				System.out.print(arr[i]+" ");
			}
			reArrange(arr, n);
			System.out.println();
			System.out.print("Modified Array :- ");
			for(int i=0;i<n;i++) 
			{
				System.out.print(arr[i]+" ");
			}
		}
		public static void reArrange(int[] arr,int n)
		{
			int[] temp=new int[n];	
			int small=0;
			int large=n-1;
			boolean flag=true;
			
			for(int i=0;i<n;i++)
			{
				if(flag)
				{
					temp[i]=arr[large--];
				}
				else
				{
					temp[i]=arr[small++];
				}
				flag= !flag;
			}
			
			for(int i=0;i<n;i++)
			{
				arr[i]=temp[i];
			}
		}

	

}
