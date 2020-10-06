/*17.	Write a program to reverse a given number.*/

import java.util.Scanner;
class ass1q17{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any no");
		int num=sc.nextInt();
		int digit;
		int rev=0;
		while(num!=0){
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println(rev);
		
		}
		
		
	}
