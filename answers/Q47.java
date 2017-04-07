import java.util.*;
class Q47
{ public static void main(String args[])
   {  int a=args.length;
       String nm[]=new String[a];
for(int i=0;i<a;i++)
    nm[i]=args[i];

       String temp=" ";
     for(int i=0;i<a-1;i++)
     { for(int j=i+1;j<a;j++)
        {  if(args[i].compareTo(args[j])>0)
                  {  temp=args[i];
                        args[i]=args[j];
                        args[j]=temp;
                    }
      }
   }
 
       for(int i=0;i<a;i++)
       System.out.println(args[i]);
    

}
}

    