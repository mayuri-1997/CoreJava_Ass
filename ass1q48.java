/*49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method
 calcTax(). a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax 
 on yearly salary. b. Create class Product(pid,price,quantity) and implement Taxable to calculate
 salesTax on unit price of product. c. Create class for main method(Say XYZ), accept employee 
 information and a product information from user and print income tax and sales tax respectively.*/
 
 interface Texable{
	 int salesTax=7;
	 double incomeTax=10.5;
	  
	 void calcTax(); 
	 void show();
 }
 
 class Employee implements Texable{
	 int empId;
	 String name;
	 double salary;
	 
	 Employee(){
		 
	 };
	 Employee(int empId,String name,double salary ){
		 this.empId=empId;
		 this.name=name;
		 this.salary=salary;
	 }
	 public void calcTax(){
		double incomeTax1=salary*12*incomeTax;
		 
	 }
	 public void show(){
		 System.out.println(incomeTax1);
	 }
 }
 class Product implements Taxable{
	 int pid;
	 int price;
	 int quantity;
	 
	 Product(){
		 
	 }
	 Product(int pid,int price,int quantity){
		 this.pid=pid;
		 this.price=price;
		 this.quantity=quantity;
	 }
	 public void calcTax(){
		double salesTax1=price*7;
		 
	 }
	 public void show(){
		 System.out.println(salesTax1);
	 }
	 
 }
 
 class main{
	 public static void main(String args[]){
		 Employee e=new Employee(101,"mayu",1200);
		 Product p=new Product(102,210,3);
		 e.calcTax();
		 e.show();
		 p.calcTax();
		 p.show();
		 
	 }
 }
 