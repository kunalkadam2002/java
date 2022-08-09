class cmdmaxno{
  public static void main(String args[]){
   int a,b,c;
  a=Integer.parseInt(args[0]);
  b=Integer.parseInt(args[1]);
  c=(Integer)Math.max(a,b);
  System.out.println("the max no is :"+c);
  }
}