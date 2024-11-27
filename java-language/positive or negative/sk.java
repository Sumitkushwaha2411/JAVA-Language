import java.util.Scanner;
    public class sk
    {
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            int a;
            System.out.println("enter the number :");
            a=s.nextInt();
            if(a>0)
            {
                System.out.println("positive");
            }
            else
            {
                System.out.println("negative");   
            }
        }
    }