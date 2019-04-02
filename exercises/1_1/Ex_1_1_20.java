/**
 * Ex_1_1_20
 */
public class Ex_1_1_20 {

    public static double lnN(int N) {
        if (N==1) {
            return 0;
        } else {
            return lnN(N-1) + Math.log(N);
        }
    }

    public static void main(String[] args) {
        System.out.println(lnN(10));
    }
}