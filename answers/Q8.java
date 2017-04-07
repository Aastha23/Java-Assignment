

class Maximum
{         
    public double max(double a,double b) 
       { double j;
        if(a>=b)
                j=a;
          else
               j=b;
            return(j);
       }


      public double max(double a,double b,double c) 
       { double j;
        if(a>=b)
          if(a>=c)
                j=a;
          else
               j=c;
        else
         if(b>=c)
              j=b;
         else
              j=c; 
        return(j);
       }   
 }


class Q8
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
Maximum m= new Maximum();

 double i,j=0,k=0;
 
 if(a>=b)
    i=  m.max(a,c,d);
    else
     i=m.max(c,d,b);     
 System.out.println("max is"+i);    

  
  if(a<i && b<i && c<i)
    j=m.max(a,b,c);
 if(d<i && b<i && c<i)
    j=m.max(d,b,c);
 if(a<i && d<i && c<i)
    j=m.max(a,d,c);
 if(a<i && b<i && d<i)
    j=m.max(a,b,d);
System.out.println("second max is"+j);

if(a<i && a<j)
   {
      if(b<i && b<j)
      k=m.max(a,b);
    if(c<i && c<j)
      k=m.max(a,c);
     if(d<i && d<j)
      k=m.max(a,d);
    }
if(b<i && b<j)
    {
    if(c<i && c<j)
      k=m.max(c,b);
    if(d<i && d<j)
      k=m.max(b,d);
    }
if(d<i && d<j && c<i && c<j)
      k=m.max(c,d);
System.out.println("third max is"+k);
}
}