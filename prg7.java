import java.util.*;
class series
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("enter the number of terms");
		n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
		}
		System.out.println("the sum of series is="+sum);
	}
}