import java.util.*;
class Q4
{
   public static void main(String args[])
    {  
        Scanner sc=new Scanner(System.in);
 System.out.println("enter purchase price");
        double p=sc.nextDouble();
        System.out.println("enter deprication");
        double d=sc.nextDouble();
 System.out.println("enter years of service");
        double y=sc.nextDouble();
   double s=p-d*y;
 System.out.println("the salvage value  is"+s);


}
}