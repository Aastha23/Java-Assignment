import java.util.*;
class Display
{
       void dis(int a)
           {   String  b="   ";    
                  switch(a)
                  {   case 1: b="one";
                    break;
                     case 2: b="two";
                    break;
                     case 3: b="three";
                    break;
                     case 4: b="four";
                    break;
                     case 5: b="five";
                    break;
                     case 6: b="six";
                    break;
                     case 7: b="seven";
                    break;
                     case 8: b="eight";
                    break;
                     case 9: b="nine";
                    break;
                     }
                    System.out.print(b);
              }

  void no(int k,int l)
  {   if(k==1)
       {      
         String  b="   ";    
               switch(l)
               { case 0: b="ten"; 
                  break;
                   case 1:b="eleven";
                   break;
                   case 2:b="twelve";
                   break;
                   case 3: b="thirteen";
                    break;
                     case 4: b="forteen";
                    break;
                     case 5: b="fifteen";
                    break;
                     case 6: b="sixteen";
                    break;
                     case 7: b="seventeen";
                    break;
                     case 8: b="eighteen";
                    break;
                     case 9: b="ninteen";
                    break;
                  }
                 System.out.print(b);
        }
  
else 
{
 String  b="   ";    
               switch(k)
               {  case 2: b="twenty";
                    break;
                     case 3: b="thirty";
                    break;
                     case 4: b="forty";
                    break;
                     case 5: b="fivty";
                    break;
                     case 6: b="sixty";
                    break;
                     case 7: b="seventy";
                    break;
                     case 8: b="eighty";
                    break;
                     case 9: b="ninty";
                    break;
                  }
                 System.out.print(b+" "); 
                  dis(l);
   }
 }

void a(int a)
{   int r,s;
      r=a/100000000;
      a=a%100000000;
      s=a/10000000;  
     a=a%10000000; 
     no(r,s);
    System.out.print(" crore ");
 }

void b(int a)
{ int s;
    a=a%100000000; 
     s=a/10000000;  
    a=a%10000000; 
     dis(s);
    System.out.print(" crore ");
}

void c(int a)
{  int t,u;
    a=a%100000000;
    a=a%10000000; 
      t=a/1000000;
     a=a%1000000;
     u=a/100000;
     a=a%100000;   
     no(t,u);
     System.out.print(" lakh ");
}

void d(int a)
{ int u;
  a=a%100000000;
    a=a%10000000; 
    a=a%1000000;
    u=a/100000;
     a=a%100000;   
     dis(u);
   System.out.print(" lakh ");
}

void e(int a)
{ int v,w;
 a=a%100000000;
    a=a%10000000; 
    a=a%1000000;
    a=a%100000;
     v=a/10000;
     a=a%10000;
     w=a/1000;
      a=a%1000;   
     no(v,w);
     System.out.print(" thousand ");
}

void f(int a)
{int w;
  a=a%100000000;
    a=a%10000000; 
    a=a%1000000;
    a=a%100000;
    a=a%10000;
      w=a/1000;
       a=a%1000;   
       dis(w);
      System.out.print(" thousand ");
}

void g(int a)
{int x;
  a=a%100000000;
    a=a%10000000; 
    a=a%1000000;
    a=a%100000;
    a=a%10000;
      a=a%1000;
    x=a/100;
    a=a%100;
   dis(x);
   System.out.print(" hundred ");
}

void h(int a)
{  a=a%100000000;
    a=a%10000000; 
    a=a%1000000;
    a=a%100000;
    a=a%10000;
      a=a%1000;
   a=a%100;
  int y=a/10;
     a=a%10;
   no(y,a);
}

}
class Q12
{ public static void main(String args[])
   {  Scanner sc=new Scanner(System.in);
    System.out.print("enter a no");
    int a=sc.nextInt();
    Display d= new Display();

int n=0,aa=a;
while(aa>0)
 {n++;                // n is the no of digits in the number
 aa=aa/10;
  } 

if(n==9)
 {d.a(a);  d.c(a);  d.e(a);    d.g(a);   d.h(a);}                

 // 2nd way: b=a; d.a(a); a=a%100000000; a=a%10000000; d.c(a); a=a%1000000; a=a%100000; d.e(a);  and so on...   
//   and then again set b=a; and do the same for n=7.  
                                                                           
if(n==7)
 {  d.c(a);  d.e(a);    d.g(a);   d.h(a);}
if(n==5)
 {  d.e(a);    d.g(a);   d.h(a);}
if(n==3)
 {     d.g(a);   d.h(a);}
if(n==8)
 {d.b(a);  d.c(a);  d.e(a);    d.g(a);   d.h(a);}
if(n==6)
 {  d.d(a);  d.e(a);   d.g(a);   d.h(a);}
if(n==4)
 {  d.e(a);    d.g(a);   d.h(a);}
if(n==2 ||  n==1)
 {   d.h(a);}
}
}








