import java.util.Scanner;
class ass1q26{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int arr[][]=new int[5][];
		int a[]=new int[5];
		int b[]=new int[3];
		int c[]=new int[4];
		int d[]=new int[3];
		int e[]=new int[2];
		
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int x[] : arr){
			int sum =0;
			for(int y : x){
				sum=sum+y;
				System.out.println(y + " ");
			}
			System.out.println("sum is " +sum + "\n");
		}
		
		
		
	}
}