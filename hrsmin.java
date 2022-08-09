import java.util.*;
class hrsmin{
   public static void main(String args[]){
    int no,hrs,min;
    Scanner d1=new Scanner(System.in);
    no=d1.nextInt();
    hrs=no/60;
    min=no%60;
    System.out.println("the no in hrs and min is : "+hrs+"."+min);
  }
}