/**
 * Ex_1_1_14
 */
public class Ex_1_1_14 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println(lg(N));
    }

    public static int lg(int N) {
        int res = 1;

        while (res <= N) {
            res *= 2;
        }

        return res / 2;
    }
}