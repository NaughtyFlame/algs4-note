import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Ex_1_1_31
 */
public class Ex_1_1_31 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        StdDraw.setPenRadius(0.005);
        double r = 0.5;

        if (p < 0 || p > 1) {
            System.out.println("Error for parameter `p`.");
        }
        
        // draw a cycle, center=(0,0), r=1
        StdDraw.circle(0.5, 0.5, r);

        // calculate the location of points.
        double[][] points = new double[N][2];
        for (int i = 0; i < N; i++) {
            points[i][0] = Math.cos(2 * Math.PI / N * i) * r + .5;
            points[i][1] = Math.sin(2 * Math.PI / N * i) * r + .5;
            StdDraw.point(points[i][0], points[i][1]);
        }

        // draw lines

        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (StdRandom.bernoulli(p)) {
                    StdDraw.line(points[i][0], points[i][1], points[j][0], points[j][1]);
                }
            }
        }


    }
}
