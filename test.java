import java.util.Scanner;
class a{
	int z;
	a()
	{
		System.out.println("hello i am the base class constructor");
	}
	void add(int x,int y){
		z = x+y;
		System.out.println("the addition of 2 numbers is = "+z);
	}

	void sub(int x,int y){
		z = x-y;
		System.out.println("the subtraction of 2 numbers is = "+z);
	}
}
class b extends a{
	b()
	{
		System.out.println("hello i am the derived class constructor");
	}
	void mul(int x,int y){
		z = x*y;
		System.out.println("the addition of 2 numbers is = "+z);
	}

	void div(int x,int y){
		z = x/y;
		System.out.println("the subtraction of 2 numbers is = "+z);
	}
}
class test{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,e;
		System.out.println("enter the value of a = ");
		a = sc.nextInt();
		System.out.println("enter the value of a = ");
		e = sc.nextInt();
		b ob1 = new b();
		ob1.add(a,e);
		ob1.sub(a,e);
		ob1.mul(a,e);
		ob1.div(a,e);
			
	}
}