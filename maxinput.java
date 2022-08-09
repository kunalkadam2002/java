import java.util.*;
class maxinput{
   public static void main(String args[]){
     int x,y,z;

     Scanner d1=new Scanner(System.in);
     System.out.println("enter value of x :");
     x=d1.nextInt();
     System.out.println("enter value of y:"); 
     y=d1.nextInt();
     
     z=(int)Math.max(x,y);
     System.out.println("the max  no is :"+z);
   }



}