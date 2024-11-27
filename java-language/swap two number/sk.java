import java.util.Scanner;
public class sk
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.print("enter the value of a :");
        a=s.nextInt();
        System.out.print("enter the value of a :");
        b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a :"+ a);
        System.out.println("value of b :"+ b);
    }
}   
