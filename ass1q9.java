import java.util.Scanner;
class ass1q9{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no. of days");
		int inputd=sc.nextInt();
		int year=inputd/365;
		int rd=inputd%365;
		System.out.println("no of years:"+year);
		int month=rd/30;
		int nd=rd%30;
		System.out.println("no of months:"+month);
		int day=nd;
		System.out.println("no of days:"+day);
		
	}
}