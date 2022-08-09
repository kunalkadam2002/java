import java.io.DataInputStream;
class DataInputStreamdemo5 {
 public static void main(String args[])
 
  
  throws Exception
  {
   int n,sq;
   DataInputStream d1= new DataInputStream(System.in);
   System.out.print("Enter any no :");
   n=Integer.parseInt(d1.readLine());
   sq=n*n;
   System.out.println("The square of the no is : "+sq);
  }



}