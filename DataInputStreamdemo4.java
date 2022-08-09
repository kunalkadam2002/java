import java.io.DataInputStream;
class DataInputStreamdemo4{
  public static void main(String args[] ){
   String s1;
   DataInputStream d1=new DataInputStream(System.in);
   try{
    System.out.println("enter the string ");
    s1=d1.read() ;
    System.out.println("the string is : "+s1);

   }catch(Exception e ){
     System.out.println("plz enter no only ");
     }

   }


}