import java.util.Scanner;
    public class oddeven
    {
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the number :");
            int a;
            a=s.nextInt();
            if(a%2==0)
            {
                System.out.println("even");
            }
            else
            {
                System.out.println("odd");
            }
        }
    }