import java.util.*;
class p77{
  public static void main(String args[]){
   int n,a,b,c,no;
   Scanner d1=new Scanner(System.in);
   System.out.println("enter any 3 digit no :");
   n=d1.nextInt();
   int x=n;
   
   c=n%10;
   n=n/10;
   b=n%10;
   a=n/10;
   no=a*a*a+b*b*b+c*c*c;
   
  if(no==x){
   System.out.println("the no is armstrong no");
}else{
   System.out.println("the no is not a armstrong no");
}
}
}