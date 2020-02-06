interface first{
    int a=10;
    void show1();
}
interface second{
    int b= 20;
    void show2();
}
interface third{
    int c = 30;
    void show3();
}
class A implements first,second,third{
    public void show1()
    {

        System.out.println("I am in interface 1");
        System.out.println("the value of a = "+a);
    }
    public void show2()
    {
        System.out.println("I am in Interface 2");
        System.out.println("the value of b = "+b);
    }

    public void show3()
    {
        System.out.println("I am in Interface 3");
        System.out.println("the value of c = "+c);
    }
}
public class interface2{
    public static void main(String[] args) {
    A obj = new A();
    obj.show1();
    obj.show2();
    obj.show3();        
    }
}