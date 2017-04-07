import java.util.*;
class Q42
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
      a[i][j]=sc.nextInt();} 
    }

  System.out.print("enter no of rows in matrix2 ");
     int q=sc.nextInt();
    System.out.print("enter no of columns in matrix2 ");
     int r=sc.nextInt();

    
    int b[][]=new int[q][r];
   for(int i=0;i<q;i++)
    {  for(int j=0;j<r;j++)
      {System.out.print("enter element of matrix 2  ");
      b[i][j]=sc.nextInt();} 
    }

 int c[][]=new int[m][r];

if(n==q)
{ for(int i=0;i<m;i++)
    {  for(int j=0;j<r;j++)
          { for(int k=0;k<n;k++)        
            {c[i][j]=c[i][j]+a[i][k]*b[k][j];
            }
        }
   } 

    for(int i=0;i<m;i++)
    {  for(int j=0;j<r;j++)
      { System.out.print(c[i][j]+"    ");
       }System.out.println();
    }

}
else
System.out.print("not possible enter correct no of rows and cols");

}
}