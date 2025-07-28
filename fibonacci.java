
public class fibonacci{
    public static int fibr(int n){
        //recursiva
        if (n==0) {return 0;}

        if (n==1){return 1;}

        return fibr(n-1) + fibr(n-2);
    }

    public static int fibl (int n){
        //interativa
        if (n==0) return 0; if(n==1) return 1;

        int a = 0; int b = 1;

        for (int i = 2; i<= n; i++){
            int temp=a+b;
            a=b; b=temp;
        }
        return b;
    }

    public static void main (String[] args){
        int n = 10; 
        System.out.println("fibonacci de "+ n + "é" + fibr(n));
        System.out.println ("fibonacci de"+ n + "é" + fibl(n));
    }

}