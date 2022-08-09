import java.util.*;
class leapyear{
  public static void main(String args[]){
   int y;
   String x;
   Scanner d1=new Scanner(System.in);
   System.out.println("enter any year :");
   y=d1.nextInt();
   x=(y%4==0)?"its a leap year":"it is not a leap year";
   System.out.println(x);

  }



}