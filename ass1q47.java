/*constructor chaining*/
import java.util.Scanner;

class Abc{
	Abc()
	{
		System.out.println("No-arg Constructor");
	}
	Abc(int i)
	{
		System.out.println("Para Constructor");
	}
}

class Pqr extends Abc{
	Pqr()
	{
		System.out.println("No-arg Constructor Pqr");
	}
	Pqr(int i)
	{
		super();
		System.out.println("Para Constructor Pqr");
	}
	
}

class ass1q47{
	public static void main(String args[]){
		Pqr p = new Pqr();
	}

}