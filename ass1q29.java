/*29.	Write a program to print the total number of one-D arrays in a two-D array and the number of 
elements in every one-D array present in the two-D arrays.*/

import java.util.Scanner;
class ass1q29{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[][]={{1,2,3},
			{4,5},
			{3,5,6},
			{7,8,5,7},
			};
			
			int Noof=0;
			int oneD=0;
			for(int x[]:arr){
				oneD++;
				Noof=0;
				for(int y:x){
					Noof++;
					System.out.print(y+" ");
				}
				System.out.println("every oneD array" +Noof);
			}
	}
}