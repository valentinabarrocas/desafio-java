public class primos {
    //linear
    public static void main(String[] args) 
        {plinear(30);}
    public static void plinear(int n) {
        for (int i = 2; i <= n; i++) 
        {if (primo(i)) {System.out.println(i);}}
    }
    public static boolean primo(int x) {
        for (int i=2; i<x; i++) 
        {if (x % i==0) {return false;}}
        return true;
    }
}