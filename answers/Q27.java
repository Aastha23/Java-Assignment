import java.util.*;
class Q27
{ public static void main(String args[])
   { Scanner sc=new Scanner(System.in); 
System.out.print("how many no you want to enter");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
     System.out.print("enter a no");
      a[i]=sc.nextInt();
}

int c=0;
loop1: for(int i=0;i<n-1;i++)
{  if(a[i]>a[i+1])
     c++;
    else
     { 
     System.out.println("not in descending order");
System.exit(0);
   // or break loop1;
     }
}

if(c!=0)
    System.out.println("descending order");

}
}