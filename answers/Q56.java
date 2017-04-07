import java.util.*;
 class Money
{ 
    int rupee;
    int paisa;
   double total;
 
    Money( int a , int b)
   { rupee=a;
      paisa=b;
   }
  void setmoney()
  { total=(double)(rupee*100+paisa)/100;
  }
  void show()
{ System.out.println("rupee is= "+rupee);
 System.out.println("paisa is= "+paisa);
System.out.println("total money is= "+total);
}
}

class Q56
{ public static void main(String args[])
  { 
   Scanner sc=new Scanner(System.in);
   int a,b;
   System.out.println("enter rupee");
   a=sc.nextInt();
   System.out.println("enter paisa");
   b=sc.nextInt();
   Money M=new Money(a,b);
   M.setmoney();
M.show();
}
}

