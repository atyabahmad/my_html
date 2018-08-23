import java.util.*;
class pattern2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=i;k<5;k++)
			System.out.print(" ");
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}