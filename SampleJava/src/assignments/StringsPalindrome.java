package assignments;

public class StringsPalindrome {

	public static void main(String[] args) {
		StringBuffer j=new StringBuffer("JAVA");
		StringBuffer m=new StringBuffer("malayalam");
		StringBuffer jr=j.reverse();
		StringBuffer mr=m.reverse();
		System.out.println(jr);
		System.out.println(mr);
		
			if(j==jr)
					{
				System.out.println("Java is a palindrome word");
					}
				else
				{
					System.out.println("Java is not a palindrome word");
				}
			if(m.equals(mr))
			{
			System.out.println("Malayalam is a palindrome word");
			}
			else
			{
				System.out.println("Malayalam is not a palindrome word");
			}
	}
}
	
		

	
	


