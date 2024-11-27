import java.util.Scanner;
    public class sk
    {
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            int a,i=1;
            System.out.println("enter the number :");
            a=s.nextInt();
            do
            {
                System.out.println(a + "*" + i + "=" + (a*i));
                i++;
            } 
            while(i<=10);
        }
    }