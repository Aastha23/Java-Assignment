import java.util.*;
class Q31
{
  public static void main(String args[])
   { 
  Scanner sc=new Scanner(System.in); 
  System.out.print("enter a no");
  int a=sc.nextInt();
  System.out.print("enter a no");
  int b=sc.nextInt();
int max;
if(a>b)
max=a;
else 
max=b;

int c=1;
for(int i=2;i<=max;i++)
{  if(a%i==0 && b%i==0)
  c=i;
}
System.out.print("the gcd of a and b is"+ c);
  
}
}


