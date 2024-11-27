import java.util.Scanner;
public class q5
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1,s2;
        System.out.println("enter the string :");
        s1=s.nextLine();
        System.out.println("enter the string :");
        s2=s.nextLine();
        if(s1.equals(s2))
        {
          System.out.println("same string");  
        }
    }
}