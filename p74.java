import java.util.*;
class p74{
  public static void main(String args[]){
    int bs,gs,ta,da,hra;
    Scanner d1=new Scanner(System.in);
    System.out.println("enter basic salary :");
    bs=d1.nextInt();
    if (bs<10000){
        ta=bs*5/100;
         da=bs*10/100;
         hra=bs*15/100;
     }else{
        ta=bs*10/100;
        da=bs*15/100;
        hra=bs*20/100;
     }
     gs=bs+ta+da+hra;
     System.out.println("the gross salary is :"+gs);
   }
  
}