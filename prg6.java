import java.util.*;
class function
{
	void prime()
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
	void armstrong()
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
	void palindrome()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number\n");
		int r,num;
		num=sc.nextInt();
		int s=0;
		int temp=num;
		while(temp!=0)
		{
			r=temp%10;
			s=(s*10)+r;
			temp=temp/10;
		}
		if(s==num)
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrome");
	}
};
class menu
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		function f1=new function();
		while(true)
		{
			System.out.println("enter \n1)for checking prime\n2)for checking armstrong\n3)for checking palindrome\n4)to exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:f1.prime();break;
				case 2:f1.armstrong();break;
				case 3:f1.palindrome();break;
				case 4:System.exit(0);
			}
		}
	}
}