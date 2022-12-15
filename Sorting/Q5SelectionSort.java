//5. WAP to sort an array using Selection Sort Algorithm.

public class Q5SelectionSort
{
	public static void main(String args[])
	{		
		int[] a = {2,5,1,6,7,9,0};
		
		for (int i=0;i<a.length;i++)
		{			
			int min = i;
			for (int j=i+1;j< a.length;j++)
			{
				if (a[j]<a[min])
				{
					min = j;
				}
			}
			
			int tempVar = a[min];
			a[min] = a[i];
			a[i] = tempVar;
		}		
		System.out.println("Sorted array using Selection Sort");
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}