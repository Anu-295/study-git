package InheitanceAssignment;

public class Child2 extends Salary{
	public void total()
	{
		float total=bs+hra-pf-deduction+bonus;
	}

	public static void main(String[] args) {
		
Child2 obj=new Child2();
obj.amount(40000, 2000, 1500);
	}

}
