class cmdsq2{
  public static void main(String args[]){
   int n,sq;
    if ( args.length != 1){
    System.out.println("plz pass only one no ");
    System.exit(0);
    }
   n=Integer.parseInt(args[0]);
   sq=n*n;
   System.out.println("the square of no is :"+sq);
   }
}