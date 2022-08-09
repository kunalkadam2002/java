class char3{
    public static void main(String args[])
     throws Exception{
        char S;
        int C;
        System.out.println("enter small alphabet :");
        S=(char)System.in.read();
        C=S-32;
        char a;
        a=(char)C;
        System.out.println("The small alphabet is :"+S);
        System.out.println("the capital alphabet is :"+a);
    }
}