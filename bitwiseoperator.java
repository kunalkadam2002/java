class bitwiseoperator{
  public static void main(String args[]){
    byte x,y,a,b,c,d,e,f;
    x=75;
    y=90;
    a=(byte)~x;
    b=(byte)(x<<4);
    c=(byte)(x>>4);
    d=(byte)(x&y);
    e=(byte)(x|y);
    f=(byte)(x^y);
  
   System.out.println("X ="+x);
   System.out.println("Y ="+y);
   System.out.println("A ="+a);
   System.out.println("B ="+b);
   System.out.println("C ="+c);
   System.out.println("D ="+d);
   System.out.println("E ="+e);
   System.out.println("F ="+f);
   }
}