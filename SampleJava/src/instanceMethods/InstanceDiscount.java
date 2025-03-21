package instanceMethods;
import java.util.Scanner;
public class InstanceDiscount {
	public float purchase(int price1,int price2,int price3)
	{
	
       float bill=price1+price2+price3;
        return bill;
        
	}
	public float discount()
	{
		float amount=purchase(400,2000,500);
		if(amount>=5000)
		{
			float discount=amount*0.2f;
			amount=amount-discount;
			System.out.println("Congradulations!Eligible for discount");
			return amount;
		}
			else {
				System.out.println("Not applicable for discount");
				return amount;
		}
	}
	public static void main(String[] args) {
		
		InstanceDiscount obj1=new InstanceDiscount();	
		InstanceDiscount obj2=new InstanceDiscount();	
		float finalprice=obj1.discount();
		System.out.println("Bill with discount: "+finalprice);
		

	}

}
