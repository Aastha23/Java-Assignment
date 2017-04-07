import java.util.*;
 class Matrix
{ int a;
   int b;
 int[][] r;
 
  Matrix(int m,int n)
{  a=m;
    b=n;
   r=new int[a][b];
}

  void setvalue()
  { for(int i=0;i<a;i++)
      {  for(int j=0;j<b;j++)
          { System.out.print("enter value");
          Scanner sc=new Scanner(System.in);
           r[i][j]=sc.nextInt();
         }
      }
  }

  void show()
{  for(int i=0;i<a;i++)
      {  for(int j=0;j<b;j++)
          { System.out.print(r[i][j]);
           System.out.print("       ");
          }
            System.out.println();
       }
}

}

class Q59
{ public static void main(String args[])
  { 
   Scanner sc=new Scanner(System.in);
   int m,n;
   System.out.println("enter no of rows");
   m=sc.nextInt();
   System.out.println("enter no of columns");
   n=sc.nextInt(); 
   Matrix M=new Matrix(m,n);
   M.setvalue();
   M.show();
}
}

