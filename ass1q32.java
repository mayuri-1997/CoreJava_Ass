/*32.	Modify the above program (no. 30) to count the no of Student objects created. 
[ In this program static variable is required ]*/



class Student{
	private  int rNo;   
	private String name;
	static int count=0;
	
	{
		count++;
	}
	
	/*public void Studentc(){
		count++;
	}*/
	
	void setData(int rNo,String name){ 
		this.rNo=rNo;
		this.name=name;
	}
	void showData(){
		System.out.println(rNo+" "+name);
	
		
	}
}

class StudentDemo{
	public static void main(String args[]){
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		
		//System.out.println(s1);
		
		s.setData(101,"Mayuri");
		s.showData();
		s.setData(102,"pooja");
		s.showData();
		s1.setData(103,"sid");
		s1.showData();
		s2.setData(104,"mshh");
		s2.showData();
		System.out.println(Student.count);
		
	}
}