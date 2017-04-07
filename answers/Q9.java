class Q9
{
   public static void main(String args[])
    {   
       int a=(int)(Math.random()*10);
 System.out.println("no a is"+a);
       int b=(int)(Math.random()*10);
 System.out.println("no b is"+b);
        int c=(int)(Math.random()*10);
 System.out.println("no c is"+c);
      int d=(int)(Math.random()*10);
 System.out.println("no d is"+d);
int e=0;
if(a%2==0)
  e++;
if(b%2==0)
  e++;
if(c%2==0)
  e++;
if(d%2==0)
  e++;

System.out.println("even no are"+e);
}
}