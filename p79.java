import java.util.*;
class p79{
  public static void main(String args[]){
   int a,b,c,sum;
   Scanner d1=new Scanner(System.in);
   System.out.println("enter 3 angles of triangle:");
   a=d1.nextInt();
   b=d1.nextInt();
   c=d1.nextInt();
   sum=a+b+c;
   if(sum==180 && a>0 && b>0 && c>0){
   System.out.println("its a triangle ");
    if(a==90|| b==90 || c==90){
    System.out.println("its a right angled triangle ");
   }else{
    System.out.println("its not a right angled triangle ");
  }


   }else{System.out.println("its not a triangle ");}

  }




}