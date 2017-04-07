import java.util.*;
class Q25
{ public static void main(String args[])
   {  System.out.print("enter n");
    Scanner sc= new Scanner(System.in); 
    int n=sc.nextInt();
double sum=0;
for(double i=1;i<=n;i++)
  sum=(1/i)+sum;
     System.out.print("Sum of given hp is "+sum);
    }
}