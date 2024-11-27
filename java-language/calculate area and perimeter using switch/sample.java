import java.util.Scanner;
public class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("press 1 for square");
        System.out.println("press 2 for rectangle");
        System.out.println("press 3 for circle");
        System.out.println("press 4 for triangle");
        System.out.print("enter your choice : ");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("press 1 for area");
            System.out.println("press 2 for perimeter");
            System.out.print("enter your choice : ");
            int chh=s.nextInt();
            System.out.println("enter the side : ");
            int d=s.nextInt();
            switch(chh)
            {
                case 1:
                System.out.println("area of square : "+ (d*d));
                break;
                case 2:
                System.out.println("perimeter of square : "+ (4*d));
                break;
                default:
                System.out.println("invalid choice");
                break;
            }
            case 2:
            System.out.println("press 1 for area");
            System.out.println("press 2 for perimeter");
            System.out.print("enter your choice : ");
            int ch1=s.nextInt();
            System.out.println("enter the length : ");
            int l=s.nextInt();
            System.out.println("enter the breadth : ");
            int b=s.nextInt();
            switch(ch1)
            {
                case 1:
                System.out.println("area of rectangle : "+ (l*b));
                break;
                case 2:
                System.out.println("perimeter of rectangle: "+ (2*(l+b)));
                break;
                default:
                System.out.println("invalid choice");
                break;
            }
            case 3:
            System.out.println("press 1 for area");
            System.out.println("press 2 for circumference");
            System.out.print("enter your choice : ");
            int ch2=s.nextInt();
            System.out.println("enter the radius: ");
            int r=s.nextInt();
            switch(ch2)
            {
                case 1:
                System.out.println("area of circle : "+ (3.14*r*r));
                break;
                case 2:
                System.out.println("circumference of circle : "+ (2*3.14*r));
                break;
                default:
                System.out.println("invalid choice");
                break;
            }
            case 4:
            System.out.println("press 1 for area");
            System.out.print("enter your choice : ");
            int ch3=s.nextInt();
            System.out.println("enter the height : ");
            int h=s.nextInt();
            System.out.println("enter the breadth : ");
            int b1=s.nextInt();
            switch(ch3)
            {
                case 1:
                System.out.println("area of triangle : "+ (0.5*b1*h));
                break;
                default:
                System.out.println("invalid choice");
                break;
            }
        default: 
        System.out.println("invalid choice");
        break;
        }
    }
}