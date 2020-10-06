/*38.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls 
Employee method to display no. of employees and total of their salaries.
*/

class Employee{
	 static int empNo=0;
	 int  salary;
	 static int totalSalary=0;
	
	//Employee()
	
	Employee(int salary){
		empNo++;
		this.salary=salary;
		totalSalary=totalSalary+salary;
	}

	
	
		
	
	void show(){
		System.out.println("total employees= " + empNo + " totalSalary= "+totalSalary);
	}
	
}

class EmployeeDemo{
	public static void main(String args[]){
		int arr[]=new int[3];
		Employee e=new Employee(2000);
		e.show();
		Employee e1=new Employee(3000);
		e1.show();
		Employee e2=new Employee(4000);
		e2.show();
		
		
		
	}
}