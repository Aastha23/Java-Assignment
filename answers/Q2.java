
class Q2
{
   public static void main(String args[])
    {  int a=(int)(Math.random()*10);
        System.out.println(a);
        int  b=(a*100);
       int c=b/50;
       System.out.println("the no of 50paisa coins required to represent "+a+" is"+c);
       int d=b/25; 
         System.out.println("the no of 25paisa coins required to represent "+a+" is"+d);
 int e=b/20; 
         System.out.println("the no of 20paisa coins required to represent "+a+" is"+e);
 int f=b/10; 
         System.out.println("the no of 10paisa coins required to represent "+a+" is"+f);
 int g=b/5; 
         System.out.println("the no of 5paisa coins required to represent "+a+" is"+g);
}
}