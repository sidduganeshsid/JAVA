
public class AssignmentQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n = 11;
		for(i=0;i<n;i++)
		{
			//For letter I
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
			
			//For letter U
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
			
			//For letter R
			for(j=0;j<n;j++)
			{
				if(j==0||i==0&&j!=n-1||j==n-1&&i>0&&i<(n-1)/2||i==(n-1)/2&&j<n-1||i>=(n-1)/2&&i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			//For single line space
			for(j=0;j<1;j++)
			{
				System.out.print(" ");
			}	
			
			//For letter O
			for(j=0;j<n;j++)
			{
				if(i==0&&j!=0&&j!=(n-1)||i==n-1&&j!=0&&j!=n-1||j==0&&i!=0&&i!=n-1||j==n-1&&i!=0&&i!=n-1)
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
			System.out.println("");
		}

	}

}
