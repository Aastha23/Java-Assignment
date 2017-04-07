import java.util.*;
class Q33
{
  public static void main(String args[])
   { 
  Scanner sc=new Scanner(System.in); 
  System.out.print("how many no you want to enter ");
  int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
  System.out.print("enter a no");
   a[i]=sc.nextInt();
}

int temp;
for(int i=n-1,j=0;i>=n/2;i--,j++)
{ temp=a[j];
a[j]=a[i];
a[i]=temp; 
}

System.out.println("array is");
for(int i=0;i<n;i++)
System.out.println(a[i]);

}
}