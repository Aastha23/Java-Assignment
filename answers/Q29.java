import java.util.*;
class Q29
{ public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in); 
     System.out.print(" enter value of n");
     int n=sc.nextInt();
System.out.println("palindrome no between 1 to "+n +" are ");
int i,k=0;
for(i=10;i<=n;i++)
     {  
     int r,s=0,a=i;
         while(a>0)
           {
            r=a%10;
             a=a/10;
              s=s*10+r;
           }
          if(s==i)
         System.out.println(s);
k++;
 }  
if(k<=0)
System.out.print("no palindrome no");

  }
}