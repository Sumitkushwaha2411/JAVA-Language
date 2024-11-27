import java.util.Scanner;
public class student
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int[] b=new int[10];
        int[] c=new int[10];
        int[] d=new int[10];
        int[] e=new int[10];
        int[] f=new int[10];
        int[] t=new int[10];
        double[] p=new double[10];
        double[] h=new double[10];
        int i;
        for(i=0;i<10;i++)
        {
            System.out.print((i+1)+" student detail :-");
            System.out.println("");
            System.out.print("enter the oops marks : ");
            b[i]=s.nextInt();
            System.out.print("enter the dsuc marks : ");
            c[i]=s.nextInt();
            System.out.print("enter the cn marks : ");
            d[i]=s.nextInt();
            System.out.print("enter the psml marks : ");
            e[i]=s.nextInt();
            System.out.print("enter the pp marks : ");
            f[i]=s.nextInt();
            System.out.println("");
            t[i]=b[i]+c[i]+d[i]+e[i]+f[i];
            p[i]=t[i]*100/500;
            h[i]=p[i]/9.5;
        }
        System.out.println("s.no\toops marks\tdsuc marks\tcn marks\tpsml marks\tpp marks\ttotal\t\tpercentage\tcgpa");
        for(i=0;i<10;i++)
        {
            System.out.println((i+1)+"\t"+b[i]+"\t\t"+c[i]+"\t\t"+d[i]+"\t\t"+e[i]+"\t\t"+f[i]+"\t\t"+t[i]+"\t\t"+p[i]+"\t\t"+h[i]);
        }
    }
}