import java.util.Scanner;
class ass1q10{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of temreture in Fehernite");
		int temp=sc.nextInt();
		int c=5*(temp-32)/9;
		System.out.println("tempreture in celcious:"+c);
	}
}