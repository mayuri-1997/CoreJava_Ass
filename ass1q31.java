/*31.	Create a class Student with 2 data members rno and name. Create one method setData() 
that takes roll number and student name as parameter and stores them in data members rno and name.
 Create one more method showData() to print the data member values.
 Create another class ( main class) StudentDemo that creates Student class object and calls
 setData() and showData() methods.
*/

class Student{
	private int rno;   //private members are accesssible inside class only.
	private String name;//varible without static keyword are instance variables//for instancevariable it is necessary to create object
	
	void setData(int rollno,String sname){ //creating local varibles named as rollno,sname and returning values,datatype is void.
		rno=rollno;                        
		name=sname;
	}
	void showData(){
		System.out.println(rno+" "+name);
		
	}
}

class StudentDemo{
	public static void main(String args[]){
		Student s=new Student();//s is refrence variable stores refrence value of an object.
		//new is an operator that allocate memory to object to instance variable in class.
		//Student()-is an constructor call used to initialize objects.
		s.setData(101,"Mayuri");
		s.showData();
		s.setData(102,"pooja");
		s.showData();
		
	}
}