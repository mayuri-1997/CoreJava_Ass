import java.util.Scanner;
class ass1q27{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("enter array elemnts");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		
		}
		int min=arr[0];
		int max=arr[0];
		
		for(int x :arr){
			if(x<min){
				min=x;
			}
			if(x>max){
				max=x;
			}
		}
		
		System.out.println("MIN:" +min+ "  MAX:"+max);
		 
		
	}
}