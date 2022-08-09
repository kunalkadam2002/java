import java.util.*;
class daysmonths{
  public static void main(String args[]){
   int n,D,M;
   Scanner sc=new Scanner(System.in);
    System.out.println("enter any no :");
    n=sc.nextInt();
    M=n/30;
    D=n%30;
   System.out.println("the no in days and months is :"+M+"."+D);
  }
}