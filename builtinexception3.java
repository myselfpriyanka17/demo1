import java.lang.*;
//try with multiple catch block
public class builtinexception3
{
	public static void main(String args[])
	{
		int a=25,b=4,res;
		int arr[]= new int[4];
		try
		{
			res=a/b;
			arr[5]=90;
		}
		catch(ArithmeticException e1)
		{
			System.out.println("ERROR--- "+e1);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ERROR--- "+e1);
		}
		System.out.println("Hello");
	}
}
//this will be the change created