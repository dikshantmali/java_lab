class Udexcp
{
    public static void main(String[] args) {
        try{
            show();
        }
        catch(MyException me)
        {
            System.out.println(me.getMessage());
        }
        try{
            display();
        }
        catch(MyException me){
            System.out.println(me.getMessage());
        }
    }

    public static void show() throws MyException {
        System.out.println("I am in show");
        throw new MyException();
    }

    public static void display() throws MyException
    {
        System.out.println("I am in display");
        throw new MyException("Hello");
    }
    
   
}
class MyException extends Exception{
    MyException()
    {

    }
    MyException(String str)
    {
        super(str);
    }
}

