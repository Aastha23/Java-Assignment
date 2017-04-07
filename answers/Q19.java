import java.util.*;
class Q19
{ public static void main(String args[])
   { Scanner sc=new Scanner(System.in); 
System.out.print(" enter a multiple digit no");
int a=sc.nextInt();
System.out.print(" enter a single digit no");
int b=sc.nextInt();

int c=0,r;

while(a>0)
{ r=a%10;
   a=a/10;
   if(r==b)
   c++;
}
     System.out.println("no of times single digit no appears in mutiple digit no is"+c);

}
}