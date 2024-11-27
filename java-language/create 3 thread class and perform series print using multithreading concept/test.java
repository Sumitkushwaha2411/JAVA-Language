class A extends Thread{
    public void run()
    {
        int i;
        for (i=1;i<=10;i++ )
        {
            System.out.println(i);
        }
    }
}
class B extends Thread{
    public void run()
    {
        int i;
        for (i=11;i<=20;i++ )
        {
            System.out.println(i);
        }
    }
}
class C extends Thread{
    public void run()
    {
        int i;
        for (i=21;i<=30;i++ )
        {
            System.out.println(i);
        }
    }
}
public class test{
    public static void main (String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        a.start();
        b.start();
        c.start();
    }
}
