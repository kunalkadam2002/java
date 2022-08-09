import java.util.*;
class p80{
  public static void main(String args[]){
    int a,b,c;
    Scanner d1=new Scanner(System.in);
    System.out.println("enter 3 nos :");
    a=d1.nextInt();
    b=d1.nextInt();
    c=d1.nextInt();
    if(a==b && b==c){
    System.out.println("all nos are equal");
    


   }else if(a>=b||a>=c){
    System.out.println("the max no is "+a);

   }else if(b>=a||b>=c){
    System.out.println("the max no is "+b);

   }else{
    System.out.println("the max no is "+c);
   }
     
   }
}