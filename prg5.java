import java.util.*;
class palindrome
{
	public static void main(String ags[])
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
}