import java.util.*;
class grosssalary1{
  public static void main(String args[]){
   int bs,ta,da,hra,gs,a;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the basic salaray :");
   bs=sc.nextInt();
   a=(bs<10000)? bs+bs*5/100+bs*10/100+bs*15/100 : bs+bs*10/100+bs*15/100+bs*20/100 ;
   System.out.println(a);
  }
}