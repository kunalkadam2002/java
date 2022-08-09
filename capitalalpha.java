class capitalalpha{
   public static void main(String args[])
    throws Exception{
    char ch;
    System.out.println("enter capital alphabet :");
    ch=(char)System.in.read();
    if(ch>65 && ch<90){
     System.out.println("the entered character is capital");
    }else{
      System.out.println("the entered character is not capital");
     }
   }
}