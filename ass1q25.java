import java.util.Scanner;
class ass1q25{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements in array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//operation
		int eSum=0;
		int oSum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 == 0 )
			{
				eSum=eSum+arr[i];
			}
			else
			{
				oSum=oSum+arr[i];
			}
		}
		
		System.out.println("Sum of even nos:" +eSum);
		System.out.println("Sum of odd nos:" +oSum);
		
		
	}
}