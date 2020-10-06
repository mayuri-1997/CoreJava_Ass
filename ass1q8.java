import java.util.Scanner;
class ass1q8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of amount,rate,time");
		int amt=sc.nextInt();
		int rate=sc.nextInt();
		int time=sc.nextInt();
		int SI=amt*rate*time/100;
		System.out.println("simple intrest is: " +SI);
	}
}