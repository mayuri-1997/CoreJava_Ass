class Employee{
	int empNo;
	String eName;
	 void setData(int empNo,String eName){
		this.empNo=empNo;
		this.eName=eName;
	 }
	 void getData(){
		 System.out.println(empNo+" "+eName);
	 }
}

class EmployeeDemo{
	public static void main(String args[]){
		Employee e=new Employee();
		e.setData(102,"xyz");
		e.getData();
	}
}