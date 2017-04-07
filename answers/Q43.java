import java.util.*;
class Q43
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


int temp;
 for(int i=0;i<m;i++)
      for(int j=0;j<n;j++)
          {
             if(i<j)
            {  temp=a[i][j];
           a[i][j]=a[j][i];
           a[j][i]=temp;     
          }
     }



System.out.println("after transpose");
    for(int i=0;i<n;i++)
    {  for(int j=0;j<m;j++)
      { System.out.print(a[i][j]+"    ");
       }System.out.println();
    }




}
}