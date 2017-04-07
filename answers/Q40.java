import java.util.*;
class Q40
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
      {System.out.print("enter element");
      a[i][j]=sc.nextInt();} 
    }


  for(int i=0;i<m;i++)
    {  for(int j=0;j<n;j++)
      {System.out.print(a[i][j]+"    ");
      } System.out.println();
    }


}
}