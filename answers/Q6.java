import java.util.*;
class Q6
{
   public static void main(String args[])
    {   
       double a=Math.random();
 System.out.println("no a is"+a);
       double b=Math.random();
 System.out.println("no b is"+b);
        double c=Math.random();
 System.out.println("no c is"+c);
      double d=Math.random();
 System.out.println("no d is"+d);

  if(a>=b)
    {   if(a>=c)
            {  if(a>=d)
                  System.out.println("a is greatest");
             else
                  System.out.println("d is greatest");
             }
         else
           {  if(c>=d)
                  System.out.println("c is greatest");
             else
                  System.out.println("d is greatest");
             } 
       }
 else
      {   if(b>=c)
            {  if(b>=d)
                  System.out.println("b is greatest");
             else
                  System.out.println("d is greatest");
             }
         else
           {  if(c>=d)
                  System.out.println("c is greatest");
             else
                  System.out.println("d is greatest");
             } 
       }    





}
}