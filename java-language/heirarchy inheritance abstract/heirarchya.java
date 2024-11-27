abstract class c1 {
    abstract int calc(int a, int b);
}

class sum extends c1 {
    int calc(int a, int b) {
        return (a + b);
    }
}

class sub extends c1 {
    int calc(int a, int b) {
        return (a - b);
    }
}

public class heirarchya {
    public static void main(String[] args) {
        c1 y = new sum();
        c1 z = new sub();
        System.out.println("sum= " + y.calc(6, 5));
        System.out.println("sub= " + z.calc(6, 5));
    }
}