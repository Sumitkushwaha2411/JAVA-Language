import java.util.Scanner;
    public class reverse
    {
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the number :");
            int a,r,sum=0;
            a=s.nextInt();
            while(a>0)
            {
                r=a%10;
                sum=sum*10+r;
                a=a/10;
            }
            System.out.println("reverse :" + sum);
        }
    }