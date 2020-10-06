import java.util.*;
public class ass1q7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		int x3=sc.nextInt();
		int x4=sc.nextInt();
		int x5=sc.nextInt();
		
		int sum=x1+x2+x3+x4+x5;
		System.out.println("total is:"+sum);
		double per=(float)sum/500*100;
		System.out.println(" percentage marks "+per+ "%");
		
		
	}
}