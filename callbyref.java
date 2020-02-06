class pass{
int x,y;
public void swap(pass obj)
{
int temp;
temp=obj.x;
obj.x=obj.y;
obj.y=temp;

	System.out.println("the value after swaped is = "+obj.x+obj.y);
}
}
class callbyref{
	public static void main(String[] args) {
	pass obj = new pass();
	obj.x=50;
	obj.y=60;
	System.out.println("the value before swaped is = "+obj.x+obj.y);
	obj.swap(obj);	
	
	}
}