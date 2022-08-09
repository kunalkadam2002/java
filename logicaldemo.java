class logicaldemo{
  public static void main(String args[]){
   int x,y;
   boolean a,b,c;
   x=10;
   y=20;
   a=(x<y)&&(x>y);
   b=(x<y)||(x>y);
   c=!(x<y);
   System.out.println("X="+x);
   System.out.println("Y="+y);
   System.out.println("A="+a);
   System.out.println("B="+b);
   System.out.println("C="+c);
  }
}