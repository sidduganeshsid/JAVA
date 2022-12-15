//1.WAP to find the duplicates present in an array.

public class Q1DuplicateElems {

	public static void main(String[] args) 
	{
		//declaring and initializing an array
		int[] ar = {63,2,4,6,7,9,1,7,4,2,3,1,63};
		System.out.println("Duplicate Elements present in given array are : " );
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
			}
		}
		
		
	}

}
