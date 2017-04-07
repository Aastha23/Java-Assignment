import java.util.*;
class Q44
{ public static void main(String args[])
   {  
      Scanner sc=new Scanner(System.in);
     System.out.print("enter no of rows in matrix1 ");
     int m=sc.nextInt();
    System.out.print("enter no of columns in matrix1 ");
     int n=sc.nextInt();

    int a[][]=new int[m][n];
   for(int i=0;i<m;i++)
    {  for(int j=0;j<n;j++)
      {System.out.print("enter element of matrix 1  ");
      a[i][j]=sc.nextInt();
      } 
    }


    int b[][]=new int[m][n];
   for(int i=0;i<m;i++)
    {  for(int j=0;j<n;j++)
      {System.out.print("enter element of matrix 2  ");
      b[i][j]=sc.nextInt();
      } 
    }

int k=0;
 for(int i=0;i<m;i++)
   {   for(int j=0;j<n;j++)
        {  if(a[i][j]==b[i][j])
             k++;
        }
   }


if(k==m*n)
System.out.print("matrix are same");
else
System.out.print("not same");


}
}