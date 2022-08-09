import java.util.*;
class maxconditional{
  public static void main(String args[]){
   int x,y;
   int s1;
    Scanner sc =new Scanner(System.in);
    System.out.println("X=");
    x=sc.nextInt();
    System.out.println("Y=");
    y=sc.nextInt();
    s1=(x>y)?x:y;
    System.out.println(s1+" is max no ");
 }
}