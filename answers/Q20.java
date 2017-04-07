import java.util.*;
class Q20
{ public static void main(String args[])
   { Scanner sc=new Scanner(System.in); 
System.out.print(" enter a single digit no");
int a=sc.nextInt();

int fac=1;

while(a>0)
{ fac=fac*a;;
a--;
}
     System.out.println("factorial is"+fac);

}
}