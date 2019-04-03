import edu.princeton.cs.algs4.StdIn;

/**
 * Ex_1_1_21
 */
public class Ex_1_1_21 {

    public static void main(String[] args) {
        while (StdIn.hasNextLine()) {
            String name = StdIn.readString();
            int value_a = StdIn.readInt();
            int value_b = StdIn.readInt();
            System.out.printf("%8s|%8d|%8d|%8.3f\n",name, value_a, value_b, (value_a * 1.0 / value_b));
        }
    }
}