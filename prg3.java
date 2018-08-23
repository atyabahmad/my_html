import java.util.*;
class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,c=0;
		System.out.println("enter the number\n");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%2==0)
				c++;
		}
		if(c==2)
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is not prime");
	}
}