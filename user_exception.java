import java.util.*;
import java.lang.*;
class authentication extends Exception
{
	authentication()
	{
		System.out.println("Exception raised");
	}
}
class password_verification
{
	public static void main(String args[])
	{
		try
		{
			String pass;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter password");
			pass = sc.next();
			if(pass.equals("sahil"))
			{
				System.out.println("valid password");
			}
			else
			{
				throw new authentication();
			}
		}
		catch(authentication e)
		{
			System.out.println("password incorect");
x
		}
	}
}
