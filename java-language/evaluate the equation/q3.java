import java.util.Scanner;
public class q3
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the value of x :");
        int x=s.nextInt();
        double y=(x<=2) ? 1.5*x+3 : 2*x+5;
        System.out.println("y :"+y);
    }
}