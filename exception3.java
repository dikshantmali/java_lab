import java.util.Scanner;
public class exception3{
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
           

        } catch (final ArithmeticException ae) {
            System.out.println("division by zero");
        }
        catch (final ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("array index out of bond exception occures");
        }
        finally
        {
            System.out.println("I am in final block ");
        }


        

    }
}
