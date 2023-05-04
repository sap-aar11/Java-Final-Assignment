
public class Patterns {

	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<---------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<---------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Inside Main >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<    Pattern1    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		pattern1();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<---------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<---------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	public static void pattern1()
	{
		int n=10;
		for(int i=0;i<n; i++)
		{
			for(int j=0 ; j<n; j++)//I
			{
				if((i==0 && j<=(3*n)/4)||(j==(n-1)/2)||(i==n-1&&j<=(3*n)/4))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			for(int j=0 ; j<n; j++) // N
			{
				if((j==0)||(j==n-1) || (i==j && j<=n-1)	)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
			}System.out.print(" ");
			for(int j=0 ; j<n; j++)//E
			{
				if((i==0 && j<=(3*n)/4) ||( i==(n-1)/2 && j<=(n-1)/2 )||( i==n-1 && j<=(3*n)/4) || (j==0) )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0 ; j<n; j++)//U
			{
				if((j==0&&(i!=n-1))||(i==n-1 && (j!=0 && j!=(3*n)/4 &&j<=(3*n)/4))||(j==(3*n)/4 && i!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0 ; j<n; j++)//R
			{
				if((j==0)||(i==0 && j<(3*n)/4)||(i>0 && i<(n-1)/2 && j==(3*n)/4 )||(i==(n-1)/2 && j<(3*n)/4) ||(i==j && i>(n-1)/2))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0 ; j<n; j++)//o
			{
				if((j==0&&(i!=n-1)&& i!=0) || (i==0 && j>0 && j<(3*n)/4) || (j==(3*n)/4&&(i!=n-1)&& i!=0) || (i==n-1 && j>0 && j<(3*n)/4))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0 ; j<n; j++) // N
			{
				if((j==0)||(j==n-1) || (i==j && j<=n-1)	)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
			}	
			System.out.println();
		}
	}


}
