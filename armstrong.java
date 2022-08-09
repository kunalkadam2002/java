import java.util.*;
class armstrong{
  public static void main(String args[]){
    int a,d1,d2,d3,x;
    String s1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 3 digits :");
    a=sc.nextInt();
    int m=a;
    d3=a%10;
    a=a/10;
    d2=a%10;
    d1=a/10;
     x=d1*d1*d1 + d2*d2*d2 + d3*d3*d3;
     s1=(x==m)?"its a armstrong number":"its not a armstrong number"; 
     System.out.println(s1);
   }
}