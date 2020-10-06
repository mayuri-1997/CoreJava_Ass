/*44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting
 facultyId as input and another printSalary() to print salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance.
 Override input() method in this class that calls super class inut() method and accepts basicSalary
 and allowance as input. Salary should not be accepted as input but should be calculated using formula
 (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. 
Override input() method in this class that calls super class inut() method and accepts workingHours
 and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula
 ( workingHour * ratePerHour )
*/

class Faculty{
	int facultyId;
	double salary;
	
	Faculty(){
		salary=0;
	}
	
	void intput(int facultyId){
		this.facultyId=facultyId;
		
	}
	
	void setSalary(double salary){
		this.salary=salary;
		
	}
	double getsalary(){
		return salary;
	}
	
	void printSalary(){
		System.out.println("salary of facultyId:"+facultyId+ "is"+salary);
		
	}
}
class FullTimeFaculty extends Faculty{
	double basicSalary;
	double allowance;
	FullTimeFaculty(){
		super();
		basicSalary=0;
		allowance=0;
	}
	void input(int facultyId,double basicSalary,double allowance){
		input(facultyId);
		this.basicSalary=basicSalary;
		this.allowance=allowance;
		
		setSalary(basicSalary+allowance);
		
	}
}
class PartTimeFaculty extends Faculty{
	double workingHours;
	double ratePerHour;
	
	PartTimeFaculty(){
		super();
		workingHour=0;
		ratePerHour=0;
	}
	
	void intput(double workingHour,double ratePerHour){
		intput(facultyId);
		
		this.workingHour=workingHour;
		this.ratePerHour=ratePerHour;
		setSalary(workingHour * ratePerHour);
		
	}
}

class ass1q44{
	public static void main(String args[]){
		FullTimeFaculty f=new FullTimeFaculty();
		PartTimeFaculty p=new PartTimeFaculty();
		f.intput(10,5000,2000);
		p.input(200,10,100);
		f.printSalary();
		p.printSalary();
	}
}