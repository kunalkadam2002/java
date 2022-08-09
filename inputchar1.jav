import java.io.DataInputStream;
class inputchar{
  public statuc void main(String args[])
 {
   char ch;
   DataInputStream d1= new DataInputStream(System.in);
    try{
      System.out.println("Enter a character :");
      ch=(char)read();
      System.out.println("the char is :"+ch);
    }
  }
}