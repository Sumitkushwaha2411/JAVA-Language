class A extends Thread {
    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("even : " + i);
            }
        }

    }
}

class B extends Thread {
    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("odd : " + i);
            }
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}