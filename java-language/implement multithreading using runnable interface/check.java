public class check implements Runnable{
    public void run()
    {
        System.out.println("hello world");
    }
    public static void main (String[] args) {
        check c=new check();
        Thread t=new Thread(c);
        t.start();
    }
}