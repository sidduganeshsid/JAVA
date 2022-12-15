public class name {
	public static void main(String arg[])
	{
		int i,j;
		int n=11;
		for(i=0;i<n;i++)
		{
			//for S letter
			for(j=0;j<n;j++)
			{				
				if(i==0&&j!=0||i==n-1&&j!=n-1||i==n/2&&j!=0&&j!=n-1||
						j==0&&i<n/2&&i!=0||
						j==n-1&&i>n/2&&i!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}			
			//For single line space
			for(j=0;j<1;j++)
			{
				System.out.print(" ");
			}	

			//for I letter 
			for(j=0;j<n;j++)
			{
				if(j==(n-1)/2||i==0||i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}			
			//For single line space
			for(j=0;j<1;j++)
			{
				System.out.print(" ");
			}	

			//for D letter
			for(j=0;j<n;j++)
			{
				if(i==0&&j!=(n-1)||i==n-1&&j!=n-1||j==0&&i!=0&&i!=n-1||j==n-1&&i!=0&&i!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}			
			//For single line space
			for(j=0;j<1;j++)
			{
				System.out.print(" ");
			}	

			//for D letter
			for(j=0;j<n;j++)
			{
				if(i==0&&j!=(n-1)||i==n-1&&j!=n-1||j==0&&i!=0&&i!=n-1||j==n-1&&i!=0&&i!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}			
			//For single line space
			for(j=0;j<1;j++)
			{
				System.out.print(" ");
			}
			
			//for U letter
			for(j=0;j<n;j++)
			{
				if(j==0&&i!=n-1||j==n-1&&i!=n-1||i==n-1&&j>0&&j<n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//For single line space
			for(j=0;j<1;j++)
			{
				System.out.print(" ");
			}
			
		    System.out.println("");
		}
		
		System.out.println(" ");
		
		for(i=0;i<n;i++)
		{
			//for G letter
			for(j=0;j<n;j++)
			{
				if(i==0&&j!=0||j==0&&i!=0&&i!=n-1||i==n-1&&j!=0&&j<n/2||j==n/2&&i>n/2||i==n/2&&j>=n/2||j==n-1&&i>=n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//For single line space
			for(j=0;j<1;j++)
			{
				System.out.print(" ");
			}
			
			for(j=0;j<n;j++)
			{
			     if(i==0&&j!=0&&j!=n-1||j==0&&i!=0||j==n-1&&i!=0||i==n/2)
			    	 System.out.print("*");
			     else
			    	 System.out.print(" ");
			}
			//For single line space
			for(j=0;j<1;j++)
			{
				System.out.print(" ");
			}
			
			//For letter N
			for(j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}			
			//For single line space
			for(j=0;j<1;j++)
			{
				System.out.print(" ");
			}
			
			//For letter E
			for(j=0;j<n;j++)
			{
				if(j==0||i==0||i==(n-1)/2||i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}			
			//For single line space
			for(j=0;j<1;j++)
			{
				System.out.print(" ");
			}
			
			//for S letter
			for(j=0;j<n;j++)
			{				
				if(i==0&&j!=0||i==n-1&&j!=n-1||i==n/2&&j!=0&&j!=n-1||
						j==0&&i<n/2&&i!=0||
						j==n-1&&i>n/2&&i!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}			
			//For single line space
			for(j=0;j<1;j++)
			{
				System.out.print(" ");
			}
			
			//for H letter
			for(j=0;j<n;j++)
			{
				if(i==n/2||j==0||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
