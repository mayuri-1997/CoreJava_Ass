/*40.	Create a class Student having data members name, roll no., age and score. Write a program to
 accept 10 records of student and store them in an array. And then arrange the student records based on
 the score group [0-50], [50-65], [65-80], [80-100].*/
 import java.util.Scanner;
 class Student{
	 String name;
	 int rollno;
	 int age;
	 int score;
 }
 
 class ass1q40{
	 public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		Student arr[]=new Student[10];
		 for(int i=1;i<arr.length;i++){
			 System.out.println("Enter name");
			 String name=sc.next();
			 System.out.println("Enter rollno");
			 int rollno=sc.nextInt();
			 System.out.println("Enter age");
			 int age=sc.nextInt();
			 System.out.println("Enter score");
			 int score=sc.nextInt();
		 
		 if(score>=0 && score<=50){
			 System.out.println("less than 50");
		 }
		 else if(score>=50 && score<=80){
			 System.out.println("between 50 and ");
		 }
		 
		 else if(score>=65 && score<=80){
			 System.out.println("between 65 and 80");
		 }
		 else if(score>=80 && score<=100){
			 System.out.println("between 80 and 100");
		 }
		 else{
			 System.out.println("not valid");
		 }
		 }
		 
		 
	 }
 }