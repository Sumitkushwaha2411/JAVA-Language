import java.util.Scanner;
public class q2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int h,w;
        System.out.print("enter the hourly wages :");
        h=s.nextInt();
        System.out.print("enter the hours worked :");
        w=s.nextInt();
        System.out.print("GROSS SALARY :"+(h*w));
    }
}