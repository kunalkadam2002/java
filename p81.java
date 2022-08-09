import java.util.*;
class p81{
  public static void main(String args[]){
    int a,b,c;
    Scanner d1=new Scanner(System.in);
    System.out.println("enter 3 nos :");
    a=d1.nextInt();
    b=d1.nextInt();
    c=d1.nextInt();
    if(a==b && b==c){
    System.out.println("all nos are same ");
  }else if(a<=b && a<=c ){
    System.out.println("min no is :"+a);
   }else if(b<=a && b<=c ){
    System.out.println("min no is :"+b);
   }else{
    System.out.println("min no is :"+c);
   }
    
   

    


  }




}