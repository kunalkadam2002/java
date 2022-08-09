class cmdsq3{
  public static void main(String args[]){
    int n,sq;
    if(args.length!=1){
     System.out.println("plz pass 1 arguement");
     System.exit(0);
   }
    try{ 
     n=Integer.parseInt(args[0]);
     sq=n*n;
     System.out.println("Number ="+n);
     System.out.println("The square is :"+sq);
   }catch(Exception e){
     System.out.println("plz enter  no only ");
   }
 }
}