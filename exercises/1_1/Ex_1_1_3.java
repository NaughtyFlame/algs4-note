import edu.princeton.cs.algs4.StdIn;
/**
 * Ex_1_1_3
 */
public class Ex_1_1_3 {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a==b && b==c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}