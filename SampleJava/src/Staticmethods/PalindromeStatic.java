package Staticmethods;

public class PalindromeStatic {
	static int number;static int n;static int result;
	public static void reverse(int number,int n,int result)
	{
		while (n!=0)
			result=result*10+n%10;
		n=n/10;
		System.out.println("Reverse of n is "+result);
		}
	public static void palindrome()
	{
		if(result==number)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("the numer is not palindrome");
		}
	}

	public static void main(String[] args) {
PalindromeStatic.reverse(231, 231, 0);
PalindromeStatic.palindrome();
	}

}
