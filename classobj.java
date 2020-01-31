class pass{
void swap(int x,int y)
{
int temp;
temp=x;
x=y;
y=temp;

	System.out.println("the value after swaped is = "+x+y);
}
}
class classobj{
	public static void main(String[] args) {
	pass a = new pass();
	int a1=5,b=6;
	System.out.println("the value before swaped is = "+a1+b);
	a.swap(a1,b);	
	}
}