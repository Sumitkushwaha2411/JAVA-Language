import java.util.Scanner;
public class temperature
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        double f;
        System.out.print("enter the temperature in fahrenheit :");
        f=s.nextDouble();
        System.out.print("the temperature in celsius :"+(f-32)*5/9);
    }
}