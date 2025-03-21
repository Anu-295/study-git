package assignments;

public class ThisCostructorReverse {
	int n; int reverse;
	public ThisCostructorReverse(int n)
	{
	this.n=n;
    reverse=0;
	while(n!=0)
	{
	int remainder=n%10;
	reverse=reverse*10+remainder;
	n=n/10;
	}
	}
	public ThisCostructorReverse()
	{
	this(4567);
	System.out.println(reverse);
	}
	public static void main(String args[])
	{
		ThisCostructorReverse obj=new ThisCostructorReverse();
	}
	}



