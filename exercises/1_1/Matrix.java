import java.util.Arrays;

/**
 * Matrix
 */
public class Matrix {

    static double dot(double[] x, double[] y){
        double ans = 0;
        for (int i = 0; i < x.length; i++) {
            ans += x[i] * y[i];
        }

        return ans;
    }

    static double[][] mult(double[][] a, double[][] b) {
        double [][] ans = new double[a.length][b[0].length];
        Arrays.fill(ans, 0.0);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                for (int k = 0; k < b[0].length; k++) {
                    ans[i][k] += a[i][j] * b[j][k]; 
                }
            }
        }
        
        return ans;
    }

    static double[][] transpose(double[][] a) {
        double [][] ans = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                ans[i][j] = a[j][i];
            }
        }

        return ans;
    }

    static double[] mult(double[][] a, double[] x) {
        
    }
}