import java.util.*;
class Q22
{ public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in); 
      System.out.print(" enter a no");
     int a=sc.nextInt();

System.out.println("its factors are");
for(int i=a;i>0;i--)
{
if(a%i==0)
System.out.println(i);
}
    


}
}