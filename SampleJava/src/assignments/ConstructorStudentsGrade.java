package assignments;

public class ConstructorStudentsGrade {
	static String name;static int p,m,c,totalmarks;
	public ConstructorStudentsGrade(String name,int p,int m,int c,int totalmarks)
	{
	this.name=name;
	this.p=p;
	this.m=m;
	this.c=c;
	this.totalmarks=totalmarks;
	}
	public int display()
	{
	totalmarks=	totalmarks+p+m+c;
	return totalmarks;
	}
	public float avg()
	{
		int firststudent=this.display();
		float avg1=totalmarks/3;
		if(avg1>=85)
		{
			System.out.println("A grade");	
		}
		else if(avg1>=70)
		{
			System.out.println("B grade");
		}
		else if(avg1>=55)
		{
			System.out.println("C grade");
		}
		else
		{
			System.out.println("Failed");
		}
		return avg1;
	}
	public static void main(String[] args) {
		ConstructorStudentsGrade obj=new ConstructorStudentsGrade("Anu",42,50,45,0);
		int firststudent=obj.display();
		float firstavg=obj.avg();
		System.out.println(name);
		System.out.println(totalmarks);
		System.out.println(firstavg);
		ConstructorStudentsGrade obj2=new ConstructorStudentsGrade("Ammu",26,35,25,0);
		int secondstudent=obj2.display();
		float secondavg=obj2.avg();
		System.out.println(name);
		System.out.println(totalmarks);
		System.out.println(secondavg);	
	}

}
