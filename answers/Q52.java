import java.util.*;
class Q52
{ public static void main(String args[])
   {  System.out.println("enter a sentence");
        Scanner sc=new Scanner(System.in);
       String st=" ";
       st=sc.nextLine();

    int len=st.length();       
   for(int i=0;i<len;i++)
     { char ch=st.charAt(i);
      if(st.charAt(i)==' ');
      else
     System.out.print(ch);
    }


}
}

    