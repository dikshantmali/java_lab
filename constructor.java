class test{
	int x,y;

	test(){
		System.out.println("hello i am constructor");
	}
	test(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("values are "+x+"and "+y);
	}
	test(test ob)
	{
		x = ob.x;
		y =ob.y;
		System.out.println("values are "+x+"and "+y);
		
	}
}
class constructor{
	public static void main(String[] args) {
		test ob = new test();
		test ob1 = new test(2,3);
		test ob3 = new test(ob1);
	}
}