import java.util.*;
class Q41
{ public static void main(String args[])
   {  
      Scanner sc=new Scanner(System.in);
     System.out.print("enter no of rows in matrix");
     int m=sc.nextInt();
    System.out.print("enter no of columns in matrix");
     int n=sc.nextInt();

    int a[][]=new int[m][n];
   for(int i=0;i<m;i++)
    {  for(int j=0;j<n;j++)
      {System.out.print("enter element of matrix 1  ");
      a[i][j]=sc.nextInt();} 
    }

     int c[][]=new int[m][n];
    int b[][]=new int[m][n];
   for(int i=0;i<m;i++)
    {  for(int j=0;j<n;j++)
      {System.out.print("enter element of matrix 2  ");
      b[i][j]=sc.nextInt();} 
    }

 for(int i=0;i<m;i++)
    {  for(int j=0;j<n;j++)
        c[i][j]=a[i][j]+b[i][j];
      }


  for(int i=0;i<m;i++)
    {  for(int j=0;j<n;j++)
      { System.out.print(c[i][j]+"    ");
      } System.out.println();
    }


}
}