import java.util.*;
class pattern4
{
	public static void main(String args[])
	{
	int i,j,z=3,a=1,b=5;
	for(i=1;i<=5;i++)
	{
		for(j=i;j<=5;j++)
			System.out.print(" ");
		for(j=1;j<=i;j++)
		{
			if(z>b)
			{
				z=1;
				b++;
			}
			System.out.print(z);
			z++;
		}
		z=a;
		a++;
		System.out.println();
	}
}
}