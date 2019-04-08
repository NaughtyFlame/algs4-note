import java.util.Arrays;

/**
 * Ex_1_1_27
 */
public class Ex_1_1_27 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);

        double[][] metric = new double[N+1][k+1];
        for (int i = 0; i <= N; i++){
            for (int j = 0; j <= k; j++){
                metric[i][j] = -1.0;
            }
        }
            
        System.out.println(binomial(N, k, p, metric));
    }

    public static double binomial(int N, int k, double p, double[][] metric) {
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        
        if (metric[N][k] == -1.0) {
            metric[N][k] = (1-p) * binomial(N-1, k, p, metric) + p * binomial(N-1, k-1, p, metric);
        }

        return metric[N][k];

    }
}