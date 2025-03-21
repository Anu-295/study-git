package assignments;

public class ThisConstructorFactorial {
	int n; int f;
	public void factorial(int n)
	{
	this.n=n;
    f=1;
	for(int i=1;i<=n;i++)
	{
	f=f*i;
	}
	}
	public void factorial()
	{
	this.factorial(3);
	System.out.println("factorial= "+f);
	}
	public static void main(String args[])
	{
		ThisConstructorFactorial obj=new ThisConstructorFactorial();
	obj.factorial();
	}
	}

