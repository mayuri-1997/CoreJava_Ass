/*39.	Create class Product with three data members (pid, price, quantity) and parameterized 
constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to 
calculate and return total amount spent on all products. ( amount spent on single product = price of
 product * quantity of product )
*/

import java.util.Scanner;
class Product{
	int pid;
	int price;
	int quantity;
	
	Product(int pid,int price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}

static int calc(product [] arr)
	{
		int amount;
		int totalAmount=0;
		for(int i=0; i<arr.length; i++)
		{
			amount = arr[i].price * arr[i].quantity;
			totalAmount = totalAmount+amount;

			System.out.println("pid: "+arr[i].pid+" amount = "+amount);
		}	
		return totalAmount;
	}
}

class ProductDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter pid");
		//int pid=sc.nextInt();
		product arr[]=new product[5];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter pid: ");
			int pid=sc.nextInt();	
			System.out.println("Enter price: ");
			int price=sc.nextInt();	
			System.out.println("Enter quantity: ");
			int quantity=sc.nextInt();	

			product p = new product(pid,price,quantity);
			arr[i] = p;		
		}

		int total = p.calc(arr);

		System.out.println("Total Amount = "+total);

		
	}
}