class Display
{
       void no(int a)
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
}


class Q11
{ public static void main(String args[])
   {  int a=(int)(Math.random()*1000)+1000;
  System.out.println("no is"+a);
  Display d= new Display();
      int i,j,k=0,l=0;   
     i=a/1000;
   a=a-i*1000;
  d.no(i);
   System.out.print(" thousand ");


   j=a/100;  
   if(j>0)
 {  a=a-j*100;
    d.no(j);
   System.out.print(" hundred ");
 }

k=a/10;
a=a-k*10;
if(k==1)
  {      l=a;
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
}
if(a>0)
{
d.no(a);
}


}
}








