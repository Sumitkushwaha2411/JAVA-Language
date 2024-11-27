import java.util.Scanner;
    public class sumofdigit
    {
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            int a,r,sum=0;
            System.out.println("enter the three digit number :");
            a=s.nextInt();
            while(a>0)
            {
                r=a%10;
                sum=sum+r;
                a=a/10;
            }
            System.out.println("SUM OF DIGITS :" + sum);
        }
    }