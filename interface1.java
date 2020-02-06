interface first{
    void show1();
}
interface second extends first{
    void show2();
}
class A implements second{
    public void show1()
    {
        System.out.println("I am in interface 1");
    }
    public void show2()
    {
        System.out.println("I am in Interface 2");
    }
}
public class interface1{
    public static void main(String[] args) {
    A obj = new A();
    obj.show1();
    obj.show2();        
    }
}
