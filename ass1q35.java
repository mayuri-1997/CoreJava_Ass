/*35.	Create a class MathOperation that has four static methods. add() method that takes two
 integer numbers as parameter and returns the sum of the numbers. subtract() method that takes 
 two integer numbers as parameter and returns the difference of the numbers. multiply() method
 that takes two integer numbers as parameter and returns the product. power() method that takes
 two integer numbers as parameter and returns the power of first number to second number. 
 Create another class Demo (main class) that takes the two numbers from the user and calls all 
 four methods of MathOperation class by providing entered numbers and prints the return values
 of every method.*/
 
 class MathOperation{
	 int num1;
	 int num2;
	 
	 static int add(int num1,int num2){
		 return num1+num2;
		 
	 }
	 static int subtract(int num1,int num2){
		 return num1-num2;
		 
	 }
	 static int multiply(int num1,int num2){
		 return num1*num2;
	 }
	 static double power(int num1,int num2){
		 return Math.pow(num1,num2);
	 }
 }
 class Demo{
	 public static void main(String args[]){
		 int n1=MathOperation.add(5,2);
		 System.out.println(n1);
		 int n2=MathOperation.subtract(5,2);
		 System.out.println(n2);
		 int n3=MathOperation.multiply(5,2);
		 System.out.println(n3);
		 double n4=MathOperation.power(5,2);
		 System.out.println(n4);
		 
	 }
 }