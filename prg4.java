import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,c=0,r;int s=0;
		System.out.println("enter the number\n");
		num=sc.nextInt();
		int temp=num;
		while(temp!=0)
		{
			temp=temp/10;
			c++;
		}
		temp=num;
		while(temp!=0)
		{
			r=temp%10;
			s=(int)(s+Math.pow(r,c));
			temp=temp/10;
		}
		if(s==num)
			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
		
	}
}