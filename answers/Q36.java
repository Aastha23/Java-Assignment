import java.util.*;

class Q36
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

System.out.println("by how many elements do you want to left shift your array");
int no=sc.nextInt();

System.out.println();
for(int j=no;j<n;j++)
System.out.println(a[j]);

for(int j=0;j<no;j++)
System.out.println(a[j]);
}
}