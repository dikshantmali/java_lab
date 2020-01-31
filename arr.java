import java.util.Scanner;
public class arr{
	public static void main(String[] args) {
		int n,m;
		int [][]a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of row = ");
		n = sc.nextInt();
		System.out.println("enter the size of column = ");
		m = sc.nextInt();
		a = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		for(int k=0;k<n;k++)
		{
			for(int l=0;l<m;l++)
			{
				System.out.println(a[k][l]);
			}
		}

	}
}