import java.util.*;
class Q34
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

int temp=a[0];
for(int j=0;j<n-1;j++)
{ a[j]=a[j+1];
} a[n-1]=temp;

System.out.println("array is");
for(int i=0;i<n;i++)
System.out.println(a[i]);

}
}