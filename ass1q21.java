
/*21.Program to show sum and average of 10 element array. Accept array elements from user. */

import java.util.Scanner;
class ass1q21{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 10 elements");
		//int num1=sc.nextInt();
		int arr[]=new int[10];
		for(int i=0; i<10; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum = 0;
		for(int a:arr)
		{
			sum=a+sum;
		}
		
		double avg =sum/10;
		System.out.println("sum:" +sum);
		System.out.println("average: " +avg);
		
		
		}
}
		
		