import java.util.Scanner;
public class q4
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.print("enter the 1 number :");
        a=s.nextInt();
        System.out.print("enter the 2 number :");
        b=s.nextInt();
        System.out.print("enter the 3 number :");
        c=s.nextInt();
        if(a>b && a>c)System.out.print("MAXIMUM:"+a);
        else if(b>a && b>c)System.out.print("MAXIMUM:"+b);
        else System.out.print("MAXIMUM:"+c);
    }
}