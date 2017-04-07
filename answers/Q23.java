import java.util.*;
class Q23
{ public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in); 
     System.out.print(" enter a no");
     int a=sc.nextInt();
int c=0;
for(int i=2;i<a;i++)
{   if(a%i==0)
     c++;
}
if(c!=0)
System.out.print("not prime");
else
System.out.print("prime");
   }
}