import java.util.*; 
class evenodd{
  public static void main(String args[]){
   int n;
   String a;

   Scanner d1=new Scanner(System.in); 
   System.out.println("enter any no :");
   n=d1.nextInt();
   a=(n%2==0)?"the no is even ":"the no is odd ";
   System.out.println(a);
  }
}