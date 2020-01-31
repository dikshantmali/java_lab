import java.util.Scanner;
class calc{
	int z;
	void add(int x,int y)
	{
		z=x+y;
		System.out.println("the addition of 2 number is = "+z);
	}
	void sub(int x,int y)
	{
		z=x-y;
		System.out.println("the subtraction of 2 number is = "+z);
	
	}
}
class my_calc extends calc{	
	
	void mul(int x,int y)
	{
		z=x*y;
		System.out.println("the Multiplication of 2 number is = "+z);
	
	}
	void div(int x,int y)
	{
		z=x/y;
		System.out.println("the division of 2 number is = "+z);
	
	}

}
public class inheritance{
	public static void main(String[] args) {
      		Scanner sc = new Scanner(System.in);
      		my_calc ob1 = new my_calc();
      		int a,b;
      		System.out.println("enter the first number = ");
      		a = sc.nextInt();
			System.out.println("enter the first number = ");
      		b = sc.nextInt();
				
      		ob1.add(a,b);
      		ob1.sub(a,b);
      		ob1.mul(a,b);
      		ob1.div(a,b);	
	}
}
ujiiii5