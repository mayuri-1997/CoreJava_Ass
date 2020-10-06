/*43.	Create a class OneBHK with instance variables roomArea, hallArea and price. Then create default 
constructor that initializes instance variables with some values and a parameterized constructor that 
takes values for all instance variables and stores them in instance variables. Now create a method named
 show()  to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new
 instance variable room2Area. Then create default constructor to initialize all 4 instance variables and
 a parameterized constructor to take the values for initialization of all instance variables. Override 
 show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print 
information using show method. Also print total amount of all flats. 
*/

class OneBHK{
	float roomArea;
	float hallArea;
	double price;
	
	OneBHK(){
		roomArea=45;
		hallArea=50;
		price=5000;
	}
	OneBHK(float roomArea,float hallArea,double price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	
	void show(){
		System.out.println("rrom area is= "+roomArea+" hallArea is= "+hallArea+"price is"+price);
	}
	
}
class TwoBHK extends OneBHK{
	float room2Area;
	
	TwoBHK(){
		//super(roomArea,hallArea,price);
		super();
		this.room2Area=room2Area;
	}
	TwoBHK(float roomArea,float hallArea,double price,float room2Area){
		super(roomArea,hallArea,price);
		this.room2Area=room2Area;
		
	}
	void show(){
		System.out.println("rrom area is= "+roomArea+" hallArea is= "+hallArea+"price is"+price+"room2Area is= "+room2Area);
	}
}
class Demo{
	public static void main(String args[]){
		TwoBHK two=new TwoBHK();
		two.show();
	}
}