/*28.	Initialize one String type of array and print the elements using for each loop.*/

import java.util.Scanner;
class ass1q28{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str[]=new String[5];
		System.out.println("Enter string elements");
		
		for(int i=0;i<str.length;i++){
			str[i]=sc.nextLine();
		}
		System.out.println("String elements are:");
		
		for(String x:str){
			System.out.println(x);
		}
	}
}