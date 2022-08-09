import java.util.*;
class billconditional{
  public static void main(String args[]){
   int price,bill,qua,dis;
   Scanner d1=new Scanner(System.in);
   System.out.println("enter price :");
   price=d1.nextInt();
   System.out.println("enter quantity :");
   qua=d1.nextInt();
   bill=price*qua;
   dis=(qua<50)? bill*10/100 : bill*15/100;
   System.out.println(dis);
  }
}