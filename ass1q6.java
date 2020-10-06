import java.util.Scanner;
class ass1q6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);//
		System.out.println("enter the radius of circle=");
		int rad = sc.nextInt();
		float pi =3.14F;
		double Area=pi*rad*rad;
		//System.out.println(Area);
		System.out.printf("%.3f\n" ,Area);
		double circ=2*pi*rad;
		System.out.printf("%.3f",circ);
		
		
		
	}
}