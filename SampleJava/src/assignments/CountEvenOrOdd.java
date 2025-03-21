package assignments;

public class CountEvenOrOdd {
	public static void main(String args[])
	{
	int even=0;
	int odd=0;
	int n=10;
	for(n=10;n<=20;n++)
	{
	if(n%2==0)
	{
	even=even+1;
	}
	else
	{
	odd=odd+1;
	}
	}
	System.out.println("even numbers= "+even);
	System.out.println("odd numbers= "+odd);
	}
	}
