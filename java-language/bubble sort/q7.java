import java.util.Scanner;
public class q7
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int[] a=new int[10];
       int i,j,t;
       for(i=0;i<10;i++)
       {
           System.out.print("enter the "+(i+1)+" element array :");
           a[i]=s.nextInt();
       }
       for(i=0;i<10;i++)
       {
           for(j=0;j<10-1-i;j++)
           {
               if(a[j]>a[j+1])
               {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
               }
           }
       }
       for(i=0;i<10;i++)
       {
           System.out.println(a[i]); 
       }
    }
}