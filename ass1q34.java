/*34.	Create a class Circle that has two data members, one to store the radius and another
 to store area and three methods first init() method to input radius from user, second 
 calculateArea() method to calculate area of circle and third display() method to display 
 values of radius and area. Create class CircleDemo ( main class) that creates the Circle
 object and calls init(), calculateArea() and display() methods.*/
 import java.util.Scanner;
 class circle{
	 double rad;
	 double area;
	 double pi=3.14;
	 
	 void init(int rad){
		 this.rad=rad;
		 
		 
		 
		 
	 }
	 void calculateArea(){
		 area=pi*rad*rad;
		 
		 
		 
	 }
	 void display(){
		 System.out.println("Area is "+area);
		 
	 }
 }
 class circleDemo{
	 public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter value of radius");
		 int rad=sc.nextInt();
		 circle c=new circle();
		 c.init(rad);
		 c.calculateArea();
		 c.display();
	 }
 }