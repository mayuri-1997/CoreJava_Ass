/*48.	Create an Abstract class Processor with int member variable data  and method showData
 to display data value. Create abstract method process() to define processing of member data.
 Create a class  Factorial using abstract class Processor  to calculate and print factorial of a
 number by overriding the process method. b. Create a class Circle using abstract class Processor
 to calculate and print area of a circle by overriding the process method.Ask user to enter choice 
 (factorial or circle area).  Also ask data to work upon. Use Processor class reference to achieve
 this mechanism.*/
import java.util.Scanner; 
abstract class Processor{
	double data;
	abstract void Process();
	void showData(){
		System.out.println(data);
	}
}
class Factorial extends Processor{
	void Process(){
		int fact=1;
		Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		System.out.println("enter no you want to calculate factorial");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}	
		data=fact;
		
	}
}
 class Circle extends Processor{
	 void Process(){
		 double area;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter radius of circle");
		 int rad=sc.nextInt();
		 area=3.14f*rad*rad;
		 data=area;
	 }
 }
 
 class main{
	 public static void main(String args[]){
		 Processor p=new Factorial();
		 p.Process();
		 p.showData();
		 Processor p1=new Circle();
		 p1.Process();
		 p1.showData();
	 }
 }