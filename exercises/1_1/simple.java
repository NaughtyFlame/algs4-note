import edu.princeton.cs.algs4.StdOut;
/**
 * simple
 */
public class simple {

    public static void main(String[] args) {
        System.out.println("-----1.1.1-----");
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
        
        System.out.println("-----1.1.2-----");
        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1 + 2 + "3");

        System.out.println("-----1.1.7-----");
        System.out.println("a.");
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > 0.001) {
            t = (9.0/t + t) / 2.0;
        }
        System.out.printf("%.5f\n", t);


        System.out.println("b.");
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            sum++;
        }
        System.out.println(sum);

        System.out.println("c.");
        sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);

        System.out.println("-----1.1.7-----");
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char)('a' + 4));
    }
}