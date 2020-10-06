/*this constructor*/

class Student{
	private int rollno;
	private String name;

	Student(){
	this(100,"mayuri");
		System.out.println("no-argument constructor");
	}

	Student(int rollno, String name){
		//is();
		this.rollno = rollno;
		this.name = name;
		System.out.println("Param argument constructor");
	}

	void show(){
		System.out.println(rollno+" "+name);
	}
}

class ass1q41{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.show();
	}
}
