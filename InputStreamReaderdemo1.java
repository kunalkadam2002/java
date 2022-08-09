import java.io.*;
class InputStreamReaderdemo1{
 public static void main(String args[]){
   int n,sq;
   BufferedReader d1=new BufferedReader(new InputStreamReader(System.in));
   try{
   System.out.println("enter the no :");
   n=Integer.parseInt(d1.readLine());
   System.out.println("the no is :"+n);
   sq=n*n;
   System.out.println("the square of the no is :"+sq);

    }catch(Exception e){
     System.out.println("plz enter no only ");
     }

  }




}