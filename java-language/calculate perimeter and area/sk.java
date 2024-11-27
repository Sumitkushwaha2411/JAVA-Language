import java.util.Scanner;
    public class sk
    {
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the RADIUS :");   
            int r;
            double a,c;
            r=s.nextInt();
            a=3.14*r*r;
            c=2*3.14*r;
            System.out.println("area =" + a);
            System.out.println("circumfrence=" + c);
        }
    }