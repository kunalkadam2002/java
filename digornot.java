class digornot{
  public static void main(String args[])
   throws Exception{
    char ch;
    System.out.println("enter any character :");
    ch=(char)System.in.read();
    if(ch>48 && ch<57){
       System.out.println("the entered character is number ");
        }else{
          System.out.println("the entered character is not a number ");
      }
    }
  }
