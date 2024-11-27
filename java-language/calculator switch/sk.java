import java.util.Scanner;
public class sk
{
  public static void main (String args[])
  {
    Scanner s = new Scanner (System.in);
    int a, b,ch;
    System.out.print ("enter the value of a :");
    a = s.nextInt ();
    System.out.print ("enter the value of b :");
    b = s.nextInt ();
    System.out.println ("press 1 for add");
    System.out.println ("press 2 for substract");
    System.out.println ("press 3 for multiply");
    System.out.println ("press 4 for division");
    System.out.print ("enter your choice:");
    ch = s.nextInt ();
    switch (ch)
    {
      case 1:
      System.out.println ("SUM :"+ (a+b));
      break;
      case 2:
      System.out.println ("SUBSTRACT :"+ (a-b));
      break;
      case 3:
      System.out.println ("MULTIPLICATION :"+ (a*b));
      break;
      case 4:
      System.out.println ("DIVIDE :"+ (a/b));
      break;
      default:
      System.out.println("INVALID INPUT");
      break;
    }
  }
}
