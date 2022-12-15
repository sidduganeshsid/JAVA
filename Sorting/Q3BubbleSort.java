//3. WAP to sort an array using Bubble Sort Algorithm.

public class Q3BubbleSort {

	public static void main(String[] args) {
		int[] a= {3,52,5,2,93,8,7,4};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					//swapping using third tempVar
					int tempVar = a[j];
					a[j] = a[j-1];
					a[j-1] = tempVar;
				}
			}
		}
		System.out.println("Sorted array using Bubble Sort");
		for(int elem : a)
		{
			//print elements is ascending order (sorted)
			System.out.print(elem + " ");
		}

	}

}
