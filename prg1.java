import java.util.*;
class bank_account
{
	int account_no;
	String name;
	double balance;
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the back account number");
		account_no=sc.nextInt();
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the bank balance");
		balance=sc.nextDouble();
		System.out.println();
		System.out.println();
	}
	void display()
	{
		System.out.println("The details are");
		System.out.println("Bank Accont Number="+account_no+"\n"+"Name="+name+"\n"+"Balance="+balance);
		System.out.println();
		System.out.println();
	}
	void compare(bank_account b11,bank_account b22)
	{
		System.out.println();
		System.out.println();
		if(b11.balance>b22.balance)
			System.out.println(b11.name+" has more balance");
		else
			System.out.println(b22.name+" has more balance");
	}
		
};
class bank
{
	public static void main(String args[])
	{
		bank_account b1=new bank_account();
		bank_account b2=new bank_account();
		System.out.println("enter details for 1st account holder");
		b1.get();
		System.out.println("enter details for 2nd account holder");
		b2.get();
		System.out.println("the details of 1st account holder");
		b1.display();
		System.out.println("the details of 2nd account holder");
		b2.display();
		b1.compare(b1,b2);
	}
}