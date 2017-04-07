
import java.util.*;
class Q51
{ public static void main(String args[])
   {  System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
       StringBuffer st=new StringBuffer(sc.nextLine());
        String s1=st.toString();
       
          st=st.reverse();
         String s2=" ";
        s2=st.toString();
       if(s1.compareTo(s2)==0)
       {System.out.println(" it is palindrome");}
      else
     { System.out.println(" it is not palindrome");}
}
}

    