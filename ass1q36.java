/*36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate
 multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
*/
/* function ocerloading means function having same name and diffrent number,type,order of
 parametrs.*/
import java.util.Scanner;
class MathOperation{
	
	void multiply(int n1,int n2){
		int mul=n1*n2;
		System.out.println("Multiplication of int elements is: "+mul);
	}
	
	void multiply(float f1,float f2,float f3){
		double mul1=f1*f2*f3;
		System.out.println("Multiplication of float elemnts is: "+mul1);
	}
	
	void multiply(int arr[]){
		double mul=1;
		for(int i=0;i<arr.length;i++){
			mul=mul*arr[i];
			//System.out.println(mul);
		}
		System.out.println("Multiplication of array elements is: "+mul);
			
	}
	void multiply(double d,int n){
		double mul=d*n;
		System.out.println("mul of one float and one int is: "+mul);
	}
	
	
}
class demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elemnts");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		MathOperation m=new MathOperation();
		m.multiply(2,4);
		m.multiply(1.2f,1.4f,1.8f);
		m.multiply(arr);
		m.multiply(2.0d,3);
		
	}
}