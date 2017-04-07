import java.util.*;
class Q18
{ public static void main(String args[])
   { Scanner sc=new Scanner(System.in); 
System.out.print(" enter a no");
int a=sc.nextInt();
int sum=0,r,s;

while(a>0)
{ r=a%10;
   a=a/10;
   sum=sum+r;
}
     System.out.println("sum is"+sum);

}
}