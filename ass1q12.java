import java.util.Scanner;

public class asgn12
{
    	public static void main( String[] args ) 
    	{
		Scanner sc = new Scanner(System.in);
	
		float basic, gs, da, hra;

		System.out.print("\nEnter basic salary:");
		basic = sc.nextFloat();
	
		if (basic<10000)
		{
			hra = basic * 10 / 100;
			da = basic * 90 / 100;
		}
		else
		{
			hra = 2000;
			da = basic * 98 / 100;
		}
		gs = basic + hra + da;
		System.out.print("\nGross salary = Rs." + gs);
    }

}
