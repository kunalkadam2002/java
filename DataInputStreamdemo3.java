import java.io.DataInputStream;
class DataInputStreamdemo3{
  public static void main(String args[])
   {
    float r,a;
    DataInputStream d1 = new DataInputStream(System.in);
    try{ 
    System.out.println("enter radius of circle =");
    r=Float.parseFloat(d1.readLine());
    a=(float)3.14*r*r;
    System.out.println("the area of circle is  :"+a);
        }catch(Exception e){
              System.out.println("enter a no only ");
            }
   }








}