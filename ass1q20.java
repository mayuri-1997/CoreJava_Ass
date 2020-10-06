import java.util.Scanner;
class ass1q20{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the range betwweun u want to print nos");
		int first=sc.nextInt();
		int last=sc.nextInt();
		int flag;
		for(int i=first; i<=last; i++)
		{
			flag=0;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j == 0)
				{
					flag =1;
					break;
				}
			}
			if(flag == 0){
				System.out.println(i);
			}
			
		}
		
	}
}
		
		
	
