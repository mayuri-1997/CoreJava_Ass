import java.util.Scanner;
class ass1q22{

	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter elements u want to sort");
	int arr[] =new int[5];
	int temp=0;
	for(int i=0;i<arr.length;i++){
		//System.out.println(arr[i]);
		arr[i]=sc.nextInt();
		
	}
	for(int i=0;i<arr.length;i++){
		for(int j=i+1; j< arr.length;j++){
			if(arr[i]<arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("array elements in decending order");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}

}








