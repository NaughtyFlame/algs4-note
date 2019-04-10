/**
 * Ex_1_1_30
 */
public class Ex_1_1_30 {
    public static int gcd(int p, int q) {
        if (q == 0 || p == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        
        boolean [][] metric = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (gcd(i, j) > 1) {
                    metric[i][j] = false;
                    metric[j][i] = false;
                } else {
                    metric[i][j] = true;
                    metric[j][i] = true;
                }
            }
        }

        // print metric
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%s ",metric[i][j]);
            }
            System.out.printf("\n");
        }
    }
}