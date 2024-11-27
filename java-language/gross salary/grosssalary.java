import java.util.Scanner;
    public class grosssalary
    {
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            int a;
            double hra,ta,da,sl;
            System.out.println("enter the salary :");
            a=s.nextInt();
            hra=(a*10)/100;
            da=(a*7)/100;
            ta=(a*5)/100;
            sl=a+hra+da+ta;
            System.out.println("GROSS SALARY :" + sl);
        }
    }