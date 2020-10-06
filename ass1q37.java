/*37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/

class Person{
	private String name;
	 private int age;
	 Person(){
		 name="abc";
		 age=18;
	 }
	 Person(String name,int age){
		 this.name=name;
		 this.age=age;
	 }
	 void display(){
		 System.out.println(name+" "+age);
	 }
	
	
}
class PersonDemo{
	public static void main(String args[]){
		Person p=new Person("mnb",21);
		p.display();
	}
}