/*Write a program to count no of words in the String.*/

import java.util.Scanner;
 
 class ass1q55
{
 
	public static void main(String args[])
	{
		System.out.println("Enter the string");
 
		Scanner sc = new Scanner(System.in);
 
		String s = sc.nextLine();
 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 
		System.out.println("Number of words in a string = " + count);
	}
}