import java.util.*;
 class Person
{ 
    String fname=" ";
    String lname=" ";
String name=" ";
 
    Person( String a , String b)
   { fname=a;
      lname=b;
   }
  void setvalue()
  { name=fname+lname;
  }
  void show()
{ System.out.println("first name is= "+fname);
 System.out.println("last name is= "+lname);
System.out.println("name is= "+name);
}
}

class Q57
{ public static void main(String args[])
  { 
   Scanner sc=new Scanner(System.in);
   String a=" ",b=" "; 
   System.out.println("enter first name");
   a=sc.nextLine();
   System.out.println("enter last name");
   b=sc.nextLine();
   Person P=new Person(a,b);
   P.setvalue();
P.show();
}
}

