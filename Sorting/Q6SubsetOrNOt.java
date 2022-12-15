//6. WAP to check whether an array is a subset of another array.

public class Q6SubsetOrNOt {
	
	public static boolean isSubset(int a[],int b[],int temp1,int temp2)
	{
		int i = 0;
		int j = 0;
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					 break;
				}				
			}
			if(j==temp1)
				return false;			
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = {1,5,3,2,4,7,8,9};
		int[] b = {5,2,7,9};
		
		int temp1 = a.length;
		int temp2 = b.length;
				
		if(isSubset(a,b,temp1,temp2))
		{
			System.out.println("b is subset of a");
		}
		else
		{
			System.out.println("b is not subset of a");
		}
	}

}
