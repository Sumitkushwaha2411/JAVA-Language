interface shape{
    abstract public double compute_area(double a,double b);
}
class rectangle implements shape{
   public double compute_area(double a,double b)
   {
   return (a*b);
   }
}
class circle implements shape{
    public double compute_area(double a,double b)
    {
    double g=3.14;
    return (2*g*a);
    }
}
class demo{
    public static void main(String args[])
    {
        rectangle r=new rectangle();
        circle c=new circle();
        double n1,n2;
        n1=r.compute_area(5.3,6.5);
        n2=c.compute_area(5.5,5.4);
        System.out.println("area of rectangle ="+n1);
        System.out.println("perimeter of circle="+n2);
    }
}