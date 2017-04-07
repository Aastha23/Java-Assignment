import java.util.*;
 class Bank
{ String name="";
   int account_no;
   double bal=0;
 
   Bank(String st,int m)
{  name=st;
     account_no=m;
}

  void initialvalue()
  { System.out.println("balance is= "+bal);
  }
void deposit()
  { System.out.println("enter deposit amount");
    Scanner sc=new Scanner(System.in);
     double a=sc.nextInt();
    bal=bal+a;
  }
void withdraw()
  { System.out.println("enter withdraw amount");
     Scanner sc=new Scanner(System.in);
     double b=sc.nextInt();
      if(bal>=b)
      bal=bal-b;
      else
     System.out.println("insufficient balance");
  }
void display()
  { System.out.println("net balance is= "+bal);
  }


}

class Q61
{ public static void main(String args[])
  { 
   Scanner sc=new Scanner(System.in);
   String st=" ";
    int m,n;
   System.out.println("enter name");
   st=sc.nextLine();
   System.out.println("enter account no");
   m=sc.nextInt(); 
   Bank B=new Bank(st,m);
   while(m>0)
 {   System.out.println("enter 1 to display initial value,2 to deposit,3 to withdraw,4 to display final balance,5 to exit");
     n=sc.nextInt();
     switch(n)
     {  case 1:B.initialvalue();
      break;
     case 2:B.deposit();
      break;
       case 3:B.withdraw();
      break;
      case 4:B.display();
      break;
     case 5:System.exit(0);
     break;
      default:System.out.println("enter correct no");
    }
  }
}
}

