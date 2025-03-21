package Staticmethods;

public class VotingEligibilityStatic {
	 static int a=19;
	public static boolean voting()
	{
		if(a>=18)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	
	public static void main(String[] args) {
		boolean age=VotingEligibilityStatic.voting();
		if(age==true)
		{
			System.out.println("Eligible for voting");	
		}
		else
		{
System.out.println("Not eligible for voting");
		}


}

	}


