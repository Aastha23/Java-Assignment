import java.util.*;
class Q49
{ public static void main(String args[])
   {  System.out.println("enter a sentence");
        Scanner sc=new Scanner(System.in);
        String st=" ";
         st=sc.nextLine();
          int len=st.length();       
int k=0,l=0;
for(int i=0;i<len;i++)
  {  char ch=st.charAt(i);
     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
          k++;
    else
      if(st.charAt(i)!=' ') 
      l++;
}
       System.out.println(" no of vowels= "+k+" no of constants = "+l);
    

}
}

    