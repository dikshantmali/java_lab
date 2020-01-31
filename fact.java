import java.util.Scanner;
class a{
	public static int fact(int n)
		{
			if(n==0)
				return 1;
			else
				return (n * fact(n-1));
		
		}
}
class fact{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,f;
		n = sc.nextInt();
		a obj = new a();
		f = obj.fact(n);
		System.out.println("Factorial is " + f);
	}
}