import java.util.Scanner;
class ass1q14{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the year to check leap year or not");
		int year=sc.nextInt();
		if((year%4 ==0) && (year%100!=0) || (year%400==0))
			System.out.println( year +  " is leap yaer ");
		else
			System.out.println("not leap year");
	}
}