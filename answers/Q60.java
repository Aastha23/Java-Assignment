import java.util.*;
 class Rational
{ int num;
   int deno;
   double c;
 
   Rational(int m,int n)
{  num=m;
    deno=n;
}

  void setvalue()
  { c=(double)num/deno;
  }

  void show()
{   System.out.println("rational no is= "+c);
 }

}

class Q60
{ public static void main(String args[])
  { 
   Scanner sc=new Scanner(System.in);
   int m,n;
   System.out.println("enter numerator");
   m=sc.nextInt();
   System.out.println("enter denominator");
   n=sc.nextInt(); 
   Rational R=new Rational(m,n);
   R.setvalue();
   R.show();
}
}

