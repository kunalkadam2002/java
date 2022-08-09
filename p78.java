import java.util.*;
class p78{
 public static void main(String args[]){
  int a,b,c,d;
  Scanner d1=new Scanner(System.in);
  System.out.println("enter angles of triangle ");
  a=d1.nextInt();
  b=d1.nextInt();
  c=d1.nextInt();
  d=a+b+c;
  if(d==180&&a>0&&b>0&&c>0){
   System.out.println("its a triangle ");
   }else{
   System.out.println("its not a triangle ");

  }



 }


}