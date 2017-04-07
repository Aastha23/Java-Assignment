import java.util.*;
class Q39
{ public static void main(String args[])
   {  
      int a=args.length;
    int j[]=new int[a];
   for(int i=0;i<a;i++)
    {
      j[i]=Integer.parseInt(args[i]);
    }


 int i,k;
  for(i=0;i<a;i++)
{  for(k=1;k<=j[i];k++)
    { System.out.print('*');
    }
 System.out.println();
}


}
}