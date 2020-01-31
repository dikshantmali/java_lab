import java.util.Scanner;
class rec{
	public static void main(String[] args) {
		int n,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of n = ");
		n = sc.nextInt();
		int []c;
		
		c = new int[n];
		System.out.println("enter the element in array = ");
		for(int i=0;i<n;i++)
		{
			c[i] = sc.nextInt();
		}

		for(int j=0;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(c[k]<c[j])
				{
					temp=c[j];
					c[j]=c[k];
					c[k]=temp;
				}
			}

		}
		System.out.print("\n\n\n\n");
		for(int l=0;l<n;l++)
		{
			System.out.println(c[l]);
		}

	}
}