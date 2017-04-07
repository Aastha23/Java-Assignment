import java.util.*;
class Q14
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

int e=0,o=0;
  int i=0;
while(i<n)
{ 
if(a[i]%2==0)
         e++;
     else
        o++;
    i++;
}
     
System.out.println("even no's are"+e);
System.out.println("odd no's are"+o);

}
}