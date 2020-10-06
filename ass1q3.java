class ass1q3{
	public static void main(String args[]){
		int x = 2;
		int y = x*x+3*x-7;
		System.out.println(y);//3
		y =x++ + ++x;
		System.out.println(x);//4
		System.out.println(y);//6
		int z =x++ - --y - --x + x++;//5-5-4+5
		System.out.println(z);
		
		boolean b1=true;
		boolean b2=false;
		boolean z1= b1 && b2 ||!(b1||b2);
		System.out.println(z1);
		
		
		
	}
}