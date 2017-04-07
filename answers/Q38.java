import java.util.*;
class Q38
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

for(int i=0;i<n;i++)
{ for(int j=i+1;j<n;j++) 
     {   if(a[i]>a[j])
          {int temp=a[i];
          a[i]=a[j];
          a[j]=temp;}
      }
}

System.out.println("array is ascendnig order is");
for(int i=0;i<n;i++)
System.out.println(a[i]);

}
}