import java.util.*;
class Q54
{ public static void main(String args[])
   {  Scanner sc=new Scanner(System.in);
   System.out.print("enter 5 shoppng items");
     String a[]=new String[5];

 for(int i=0;i<5;i++)
   a[i]=sc.nextLine();

    Vector v=new Vector(5);
for(int i=0;i<5;i++)
v.addElement(a[i]);

for(int i=0;i<5;i++)    
 System.out.print(v.elementAt(i));
    


}
}

    