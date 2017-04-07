import java.util.*;
class Q50
{ public static void main(String args[])
   {  System.out.println("enter a sentence");
        Scanner sc=new Scanner(System.in);
        String st=" ";
         st=sc.nextLine();
          int len=st.length();       
int l=1;
for(int i=0;i<len;i++)
  {  char ch=st.charAt(i);
      if(st.charAt(i)==' ') 
      l++;
}
       System.out.println(" no of words= "+l);
    

}
}

    