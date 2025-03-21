package assignments;

public class Palindrome {
		public static void main(String args[])
		{
		int number=121;
		int n=number;
		int result=0;
		while(number!=0)
		{
		result=result*10+number%10;
		number=number/10;
		}
		if(result==n)
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		}
		

	}


