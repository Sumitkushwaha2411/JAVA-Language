import java.util.Scanner;
    public class sk
    {
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the a number :");   
            int a,b,c;
            a=s.nextInt();
            System.out.println("enter the b number :");
            b=s.nextInt();
            System.out.println("enter the c number :");
            c=s.nextInt();
            System.out.println("answer " + (a/(b-c)));
        }    
    }