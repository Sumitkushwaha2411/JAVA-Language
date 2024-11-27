import java.util.Scanner;
public class palindrone
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,i,n,sum,r,c=0;
        System.out.print("enter the range : ");
        a=s.nextInt();
        for(i=1;i<=a;i++)
        {
            n=i;
            sum=0;
            while(n>0)
            {
                r=n%10;
                sum=sum*10+r;
                n=n/10;
            }
            if(i==sum)
            {
                System.out.println(i + " is a palindrone nmumber");
                c=c+1;
            }
            else System.out.println(i + " is not a palindrone number");
        }
        System.out.println(" ");
        System.out.println("total number of palindrone in a range of " +a+ " : " + c);
    }
}