import java.io.DataInputStream;
class inputchar1{
  public static void main(String args[])
 {
   char ch;
   DataInputStream d1= new DataInputStream(System.in);
    try{
      System.out.println("Enter a character :");
      ch=(char)d1.read();
      System.out.println("the char is :"+ch);
    }catch(Exception e){
       System.out.println("plz ennter char");
     }
  }
}