

import java.util.Scanner;
interface add
{
   public void addition(int a,int b);
}
interface sub
{
 public void subtraction(int a,int b);
}
interface mul
{
    public void multiplication(int a,int b);
}
interface div extends add,sub,mul
{
    public void division(int a,int b);
}
class calc implements div{
   public void addition(int a,int b)
    {
        int c = a+b;
        System.out.println("the sum is = "+c); 

    }
    public void subtraction(int a ,int b)
    {

        int c = a-b;
        System.out.println("the subtraction is = "+c);
    }
  public void multiplication(int a,int b)
    {

        int c = a*b;
        System.out.println("the multiplication is = "+c);
    }
   public void division(int a,int b)
    {

        int c = a/b;
        System.out.println("the division is = "+c);
    }
}

public class interface4{
    public static void main(String[] args) {
        int a,b;
        int ch;
        calc obj = new calc();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a = ");
        a = sc.nextInt();
        System.out.println("enter the value of b = ");
        b = sc.nextInt();
        System.out.println("----enter the below operation to perform any operation------");
        System.out.println("press 1 for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1 : obj.addition(a,b);
                        break;
            case 2 : obj.subtraction(a,b);
                        break;
            case 3 : obj.multiplication(a,b);
                        break;
            case 4 : obj.division(a,b);
                        break;
            default : System.out.println("enter a valid choice"); break;                                               
        }

    }
}