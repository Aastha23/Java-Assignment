
class Q1
{
   public static void main(String args[])
    {  int a=(int)(Math.random()*1000)+1000;
        System.out.println(a);
       System.out.println("the no of notes required to represent "+a+" is");
    System.out.println("no of 1000rs notes=1");
        int  b=a-1000;
           int k=1;                         //c is no of 500rs notes
        if(b>=500)
       { int c=b/500;
           b=b-500*c;
          k=k+c;
       System.out.println("no of 500rs notes="+c);
       }
    if(b<500 && b>=100)
     {    int d=b/100;  
         System.out.println("no of 100rs notes="+d);
          b=b-(100*d);
 k=k+d;
     } 
   if(b<100&& b>=50) 
   {    int e=b/50;
         System.out.println("no of 50rs notes="+e);
         b=b-50*e;
 k=k+e;
    }
if(b<50&& b>=20) 
   {    int f=b/20;
         System.out.println("no of 20rs notes="+f);
         b=b-20*f;
 k=k+f;    
}
if(b<20&& b>=10) 
   {    int g=b/10;
         System.out.println("no of 10rs notes="+g);
         b=b-10*g;
 k=k+g; 
   }
if(b<10&& b>=5) 
   {    int h=b/5;
         System.out.println("no of 5rs notes="+h);
         b=b-5*h;
 k=k+h;    
}
if(b<5&& b>=2) 
   {    int i=b/2;
         System.out.println("no of 2rs notes="+i);
         b=b-2*i;
 k=k+i;   
 }
if( b==1) 
   {   int j=1;
      System.out.println("no of 1rs notes="+j);
k=k+1;    }
System.out.println("min no of notes required are"+ k );
}
}
