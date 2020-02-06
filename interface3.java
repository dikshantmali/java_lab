interface first{
    void show1();
}
interface second{
    void show2();
}
interface third{
    void show3();
}
interface four extends first,second,third{
    void show4();
}
class A implements four{
    public void show1()
    {
        System.out.println("I am in interface 1");
    }
    public void show2()
    {
        System.out.println("I am in Interface 2");
    }
    public void show3()
    {
        System.out.println("I am in Interface 3");
    }
    public void show4()
    {
        System.out.println("I am in Interface 4");
    }
}
public class interface3{
    public static void main(String[] args) {
    A obj = new A();
    obj.show1();
    obj.show2(); 
    obj.show3();
    obj.show4();       
    }
}
