import java.util.*;
class month
{
	String name;
	int tot_days,tot_hdays;
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of month");
		name=sc.next();
		System.out.println("enter the total number of days");
		tot_days=sc.nextInt();
		System.out.println("enter the total numbe of holidays");
		tot_hdays=sc.nextInt();
		System.out.println();
		System.out.println();
	}
	void display()
	{
		System.out.println("name of month="+name+"\nnumber of days="+tot_days+"\nnumber of holidays="+tot_hdays);
		System.out.println();
	}
	void calculate(month m11,month m22)
	{
		int m1,m2;
		m1=(m11.tot_days)-(m11.tot_hdays);
		m2=(m22.tot_days)-(m22.tot_hdays);
		if(m1>m2)
			System.out.println(m11.name+" has more working days");
		else
			System.out.println(m22.name+" has more working days");
		System.out.println();
	}
};
class compute
{
	public static void main(String args[])
	{
		month mo1=new month();
		month mo2=new month();
		month mo3=new month();
		System.out.println("enter details of 1st month");
		mo1.get();
		System.out.println("enter details of 2nd month");
		mo2.get();
		System.out.println("the details of 1st month");
		mo1.display();
		System.out.println("the details of 2nd month");
		mo2.display();
		mo3.calculate(mo1,mo2);
	}
}