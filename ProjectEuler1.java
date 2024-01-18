
public class ProjectEuler1 {
public static void main(String[] args) {
    int i, res3 = 0, res5=0,res;
    System.out.println(9%3==0);
    for(i=1; i<1000;i++){
        // System.out.println(i);
        if (i%3==0) {
            res3 =res3+i;
        }else if (i%5==0) {
            res5 = res5+i;
        } else {
            System.out.println("no");
            
        } 
    }
    res=res3+res5;
    System.out.println(res);
}
    
}