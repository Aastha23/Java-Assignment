import java.util.*;
class Q24
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

int max=0,min=0;
int i=0;
while(i<n)
{   if(a[i]>max)
       { max=a[i];  
        i++;}
  else
    {min=a[i];
    i++;}
 }
     System.out.println("max is"+max);
    System.out.println("min is"+min);

}
}