/*50.	Explain the importance of toString() and equals() method of the Object class and override
 them on class Employee(empId,name,salary).  a. Create class for main method(say XYZ),and accept
 five employees information and store in an array. Also ensure if entered empId already exist or 
 not (use equals method).  b. Display all employee info using toString method.*/
 
 import java.util.Scanner;
 class Employee{
	 int empId;
	 String name;
	 double salary;
	 
	 Employee(int empId,String name,double salary){
		 this.empId=empId;
		 this.name=name;
		 this.salary=salary;
	 }
 
 
 public String toString(){  //overriding tostring method.
	 return +empId+" "+name+" "+salary;
 }
 
 public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			return empId == e.empId;
		}
		return false;
	}
	
 }
 
 class Demo{
	 public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		// Employee e=new Employee(10,"Pooja",2000);
		 //System.out.println(e);////passing refrence variable as parameter in println method//to string is called.
		 Employee arr[]=new Employee[5];
		 System.out.println("enter empId name and salary");
		 for(int i=1;i<=arr.length;i++){
			 System.out.println("enter empId");
			 int empId=sc.nextInt();
			 System.out.println("enter name");
			 String name=sc.next();
			 System.out.println("enter salary");
			 double salary=sc.nextDouble();
			 
			 Employee e=new Employee(empId,name,salary);
			 
		 }
	 }
 }