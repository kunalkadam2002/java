import java.io.DataInputStream;
class DataInputStreamdemo1{
   public static void main(String args[]){
     int n,sq;
     String s1;
     DataInputStream d1;
     d1=new DataInputStream(System.in);
     try{
        System.out.println("enter any no : ");
        s1=d1.readLine();
        n=Integer.parseInt(s1);
        System.out.println("the no is :"+n);
        sq=n*n;
        System.out.println("the square is :"+sq);
      }catch(Exception e){
        System.out.println("plz enter no only");
      }
  }





}
