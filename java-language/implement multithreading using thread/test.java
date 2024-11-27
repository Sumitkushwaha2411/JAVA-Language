class A extends Thread{
    public void run()
    {
        System.out.println("Hello world");
    }
}
public class test{
    public static void main (String[] args) {
        A a=new A();
        a.start();
    }
}