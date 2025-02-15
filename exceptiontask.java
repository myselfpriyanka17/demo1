import java.util.*;
class amtoverdue extends Exception
{
	//private int detail;
	public amtoverdue()
	{
		//detail=a;
	}
	public String toString()
	{
		return("Amount is overdue to 10000 ");
	}
}

class exceptiontask
{
	public static void checkamt(String nm ,int custid ,int amt) throws amtoverdue
	{
		if(amt>10000)
		{
			throw new amtoverdue();
		}
		else
		{
			
			System.out.println("==========CUSTOMER DETAILS==========");
			System.out.println("Name: "+nm);
			System.out.println("Customer Id: "+custid);
			System.out.println("Amountr= "+amt);
		}
	}
	public static void main (String args[])
	{
		String nm;
		int custid,amt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		nm=sc.next();
		System.out.println("Enter Customer Id");
		custid=sc.nextInt();
		System.out.println("Enter Amount");
		amt=sc.nextInt();
		try
		{
			checkamt(nm,custid,amt);//while calling no object is made henche the method will be in the same class
		}
		catch(amtoverdue a1)
		{
			System.out.println("CAUGHT THE ERROR--- "+a1);
		}
	}
}