import java.io.DataInputStream;
class DataInputStreamdemo2{
   public static void main(String args[]){
    int n,sq;
    String s1;
    DataInputStream d1= new DataInputStream(System.in);
    try{
    System.out.print("enter the no :");
    n=Integer.parseInt(d1.readLine());
    System.out.println("the no is :"+n);
    sq=n*n;
    System.out.println("the square of the no is :"+sq);
   }catch(Exception e){
      System.out.println("plz enter numbers only ");
     }
    }





}