import java.util.*;
class Q5
{
   public static void main(String args[])
    {   System.out.println("we are finding the roots of an equation");
       
        Scanner sc=new Scanner(System.in);
 System.out.println("enter a");
        double a=sc.nextDouble();
        System.out.println("enter b");
        double b=sc.nextDouble();
 System.out.println("enter c");
        double c=sc.nextDouble();
double r= ( Math.sqrt ( Math.pow(b,2) - (4*a*c) ) );
  
if(r>=0)
{ double x=(( -b+r) /2*a);
  double y= ((-b-r) / 2*a);
 System.out.println("the roots are"+x +"and"+y);
}
else
System.out.println("roots are imaginery");

}
}