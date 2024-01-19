package projectEuler;

public class ProjectEuler2 {
    public static void main(String[] args) {
        int fibo = 0,valAnt = 1, valSig = 2;
        for(int i=0; i<=4000000;i++){
            // System.out.println(i);
            fibo =valAnt+valSig;
            valAnt = valSig;
            valSig = fibo;
            if (fibo>=4000000) {
                System.out.println("ww");
                break;
            }
            System.out.println(fibo);
        }

        // System.out.println(fibo);
    }
    
}