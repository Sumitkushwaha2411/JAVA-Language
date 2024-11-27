import java.util.Scanner;
public class q1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int[] a=new int[10];
        int i,c=0;
        for(i=0;i<10;i++)
        {
            System.out.println("enter the "+(i+1)+"th element in array :");
            a[i]=s.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(a[i]%2==0)
            {
                c=c+1;
                System.out.println(a[i]);
                
            }
        }
        System.out.println("total even :"+c);
        
        
    }
}