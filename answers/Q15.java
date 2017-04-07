import java.util.*;
class Q15
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

int max=0;
int i=0;

do{   if(a[i]>max)
        max=a[i];
i++;
 }while(i<n);
     System.out.println("max is"+max);

}
}