import java.util.*;
class Q32
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

double avg,sum=0;
for(int i=0;i<n;i++)
sum=sum+a[i];
avg=sum/n;
System.out.println("avg is "+avg);

System.out.println("no greater than avg are:");
for(int i=0;i<n;i++)
if(a[i]>avg)
System.out.println(a[i]);

}
}