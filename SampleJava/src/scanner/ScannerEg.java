package scanner;
import java.util.Scanner;

public class ScannerEg {
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.next();
		System.out.println("The name is "+name);
		int n=sc.nextInt();
		System.out.println("The number is "+n);
		System.out.println("Enter a float number: ");
		float f=sc.nextFloat();
		System.out.println("float number is "+f);
		System.out.println("Adhar number: ");
		double d=sc.nextDouble();
		System.out.println(d);
		System.out.println("enter a string ");
		char c=sc.next().charAt(2);
		System.out.println(c);
		System.out.println("enter a boolean value");
		boolean b=sc.nextBoolean();
		System.out.println(b);
	}
}
