//4. WAP to sort an array using Merge Sort Algorithm.

//Merge Sort is based on Divide and Conquer Algorithm
public class Q4MergeSort
{
	public static void conquer(int a[],int start_index,int mid,int end_index)
	{
		int[] merged = new int[end_index-start_index +1];
		
		int index_1 = start_index;
		int index_2 = mid+1;
		int temp = 0;
		
		while(index_1<=mid && index_2<=end_index)
		{
			if(a[index_1]<=a[index_2])
			{
				merged[temp++] = a[index_1++];
			}	
			else
			{
				merged[temp++] = a[index_2++];
			}
		}
		
		while(index_1 <= mid)
		{
			merged[temp++] = a[index_1++];
		}
		
		while(index_2 <= end_index)
		{
			merged[temp++] = a[index_2++];
		}
		
		//original array
		for(int i=0 , j = start_index ; i<merged.length; i++,j++)
		{
			a[j] = merged[i];
		}
	}
	
	public static void divide(int a[],int start_index,int end_index)
	{
		if(start_index>=end_index)
		{
			return;
		}
		int mid = start_index + (end_index - start_index)/2;
		divide(a,start_index,mid);
		divide(a,mid+1,end_index);
		conquer(a,start_index,mid,end_index);
	}
	
	public static void main(String arg[])
	{
		int[] a = {2,5,1,9,4,0,76,23};
		
		divide(a, 0, a.length-1);
		
		System.out.println("Sorted array using Merge sort");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}