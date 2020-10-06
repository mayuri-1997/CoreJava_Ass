import java.util.Scanner;
class ass1q15{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the gender and age here");
		string ch=sc.next();
		int age=sc.nextInt();
		 if((ch == "f") || (ch == "F") && (age>18))
			 System.out.println("f eligible");
		 else
			 System.out.println("f not");
		 
		 if((ch == "m") || (ch == "M") && (age>21))
			 System.out.println("m eligible");
		 else
			 System.out.println("m not");
		 
		 
		
		
	}
}