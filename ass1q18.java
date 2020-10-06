/*18.	Program to check whether number is prime or not.*/

import java.util.Scanner;
class ass1q18{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no to check whether prime or not");
		int num=sc.nextInt();
		int flag=0;
		for(int i=2; i<num/2; i++)
		{
			
			
			if(num%i==0){
				System.out.println("not a prime no");
				flag=1;
				break;
			}
			
		}
		if(flag == 0){
			System.out.println("num is prime");
		}
		
		
	}
		
		
	}
