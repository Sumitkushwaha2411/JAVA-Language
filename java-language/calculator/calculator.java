import java.util.Scanner;
public class calculator{
    public static void main(String[] args)
    {
        System.out.println("ENTER THE FIRST NUMBER :");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("ENTER THE SECOND NUMBER :");
        int b = scan.nextInt();
        int c=a+b;
        int d=a-b;
        System.out.println("sum :" + c );
        System.out.println("subs :" + d );
        System.out.println("multiply :" + a*b );
        System.out.println("divide :" + a/b );
        System.out.println("modulus :" + a%b );
    }
}