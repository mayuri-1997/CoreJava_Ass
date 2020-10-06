/*19.	Calculate  series : 12+22+32+42+.........+n2*/

import java.util.Scanner;
class ass1q19{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any no");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			System.out.println(i);
			System.out.println(i+2);
		}
		
		
	}
}
