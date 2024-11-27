import java.util.Scanner;
    public class circle 
    {
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            int r;
            double a,c;
            System.out.println("ENTER THE RADIUS :");
            r=s.nextInt();
            a=3.14*r*r;
            c=2*3.14*r;
            System.out.println("AREA :" + a);
            System.out.println("CIRCUMFRENCE:" + c);
        }
    }