import java.util.Scanner;
class ass1q24{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter array elements..");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter element to be search.");
		int search=sc.nextInt();
		int flag=0;
		
		//serach operation//
			for(int i=0;i<arr.length;i++)
			{
			if(arr[i]==search)
			{
				System.out.println(" Element " +search+ " found at " +i+ " positon ");
				flag=1;
				break;
			}
		}
		if(flag ==0)
		{
			System.out.println(" Element " +search+ " not found ");
		}
	}
}