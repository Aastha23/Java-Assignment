import java.util.*;
class Q13
{ public static void main(String args[])
   {  System.out.print("enter a no");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int r,s=0;
       while(a>0)
   {  r=a%10;
       a=a/10;
       s=s*10+r;
   }
System.out.println("reverse is"+s);
}
}