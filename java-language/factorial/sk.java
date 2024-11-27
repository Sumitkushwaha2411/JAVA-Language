import java.util.Scanner;
    public class sk
    {
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            int a,c=1,i;
            System.out.println("enter the number :");
            a=s.nextInt();
            for(i=1;i<=a;i++)
            {
                c=c*i;
            }
            System.out.println("factorial = " + c);
        }
    }