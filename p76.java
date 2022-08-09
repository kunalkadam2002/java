import java.util.*;
class p76{
  public static void main(String args[]){
   int n,a,b,c,rev;
   Scanner d1=new Scanner(System.in);
   System.out.println("enter any 3 digit no :");
   n=d1.nextInt();
   int x=n;
   c=n%10;
   n=n/10;
   b=n%10;
   a=n/10;
   rev=a*100+b*10+c;
   if(x==rev){
    System.out.println("the no is palindrome ");
   }else{
    System.out.println("the no is not palindrome ");
   }




  }


}