package instanceMethods;
import java.util.Scanner;

public class InstanceBankAccount {
	static int balance=5000;
	private static InstanceBankAccount obj;
	public static void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("balance is "+balance);
		System.out.println("Enter the amount to be deposited: ");
		int dep=sc.nextInt();
		balance=balance+dep;
		System.out.println("Current balance is "+balance);	
	}
	public void withdrawal()
	{
		Scanner w=new Scanner(System.in);
		System.out.println("enter the amount to be withdrawn:");
		int wid=w.nextInt();
		if(wid>balance)
		{
			System.out.println("You don't have sufficient balance");
		}
		else
		{
		balance=balance-wid;
		System.out.println("Current balance is "+balance);	
		}
	}
	public static void main(String[] args) {
		InstanceBankAccount.deposit();
		InstanceBankAccount.obj=new InstanceBankAccount();
		obj.withdrawal();
	}
	
}
