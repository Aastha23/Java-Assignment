import java.util.*;
 class Student
{ int roll_no;

void get_no()
{ System.out.println("enter roll no");
  Scanner sc=new Scanner(System.in);
  roll_no=sc.nextInt();
}

void  put_no()
{ System.out.println(roll_no);
}

 }

class Test extends Student
{ float part1,part2;
  
void get_marks()
{
  System.out.println("enter marks of part1<=100");
  Scanner sc=new Scanner(System.in);
  part1=sc.nextInt();
  System.out.println("enter marks of part2<=100");
  part2=sc.nextInt();
}

void put_marks()
{System.out.println(part1);
  System.out.println(part2);
}

}

 interface Sports
{ final static float sportwt=5f;

  void putwt();
}

class Result extends Test implements Sports
{ float total;

public void putwt()
{
total=(part1+part2)/2+sportwt;
}

void display()
{System.out.println("total percentage of  "+roll_no+" is"+total);
}

}

class Q63
{ public static void main(String args[])
  { 
     Sports S;
     Result R=new Result();
     R.get_no();
     R.put_no();
     R.get_marks();
     R.put_marks();
     S=R;
     S.putwt();
     R.display();
   
}
}

