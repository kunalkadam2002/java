class char2{
   public static void main(String args[])
       throws Exception{
         char C;
         int S;
        System.out.print("enter a capital alphabet :");
        C=(char)System.in.read();
        S=C+32;
        char a;
         a=(char)S;
        System.out.println("the capital alphabet is :"+C);
        System.out.println("the small alphabet is :"+a);
       }
}