package assignments;

public class PrimeOrNot {
	public static void main(String args[])
	{
	int n=7;int s=n%3;
	int p=n%2;
	if(p==0)
	{
		System.out.println(n+" is divisible by 2");
	}
     if(s==0)
	{
	System.out.println(n+" is divisible by 3");
	System.out.println(n+" is not a prime number");
	}
	else 
	{
	System.out.println(n+" is a prime number");
	}
	
	}
}

