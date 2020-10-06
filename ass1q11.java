import java.util.Scanner;
class ass1q11{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the two numbers u want to swap");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("value of number1 after swapping is:"+num1);
		System.out.println("value of number2 after swapping is:"+num2);
	}
}