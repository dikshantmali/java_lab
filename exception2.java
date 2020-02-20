import java.util.Scanner;
public class exception2{
    public static void main(final String[] args) {
        int a, b, c;
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a = ");
        a = sc.nextInt();
        System.out.println("enter the value of b = ");
        b = sc.nextInt();
        try {

            c = a / (a - b);
            System.out.println("the value of c = " + c);
            int []A;
            A = new int[5];
            A[0] = 6;
            A[1] = 7;
            A[2] = 8;
            A[3] = 9;
            A[4] = 10;
            A[5] = 20;

        } catch (final ArithmeticException ae) {
            System.out.println("division by zero");
        }
        catch (ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("array index out of bond exception occures");
        }


        

    }
}
