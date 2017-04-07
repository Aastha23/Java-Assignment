import java.util.*;
class Q26
{ public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in); 
     System.out.print(" enter value of n");
     int n=sc.nextInt();
System.out.println("prime no between 1 to "+n +" are ");
int temp=0;
loop1: for(int j=3;j<=n;j++)
  {
    for(int i=2;i<j;i++)
     {
      if(j%i==0)
      continue loop1;
     else
     temp=j;
     }
   System.out.print(temp+" ");
  }

  }
}