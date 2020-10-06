import java.util.Scanner;
class ass1q23{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int rev[]=new int[5];
		int j=0;
		
		
		System.out.println("Enter array elements..");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=arr.length-1;i>=0;i--){
			rev[j]=arr[i];
			j++;
		}
		
		System.out.println("array elements in reverse manner are..");
		for(int i=0;i<arr.length;i++){
			System.out.println(rev[i]);
		}
	}
}