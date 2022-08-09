import java.util.*;
class p75{
  public static void main(String args[]){
    int a,b,bill,dis;
    Scanner d1=new Scanner(System.in);
   System.out.println("enter price :");
   a=d1.nextInt();
   System.out.println("enter quantity :");
   b=d1.nextInt();
   if(b<50){
    bill=a*b*10/100;
   System.out.println("bill is  :"+bill);
   }else{
     bill=a*b*15/100;
     System.out.println("bill is  :"+bill);
   }
  }
}