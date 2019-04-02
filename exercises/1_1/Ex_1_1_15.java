import java.util.Arrays;
import edu.princeton.cs.algs4.StdRandom;
/**
 * Ex_1_1_15
 */
public class Ex_1_1_15 {

    public static int[] histogram(int[] a, int M) {
        int[] res = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < M) {
                res[a[i]] += 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // random generate array.
        int len_array = 10;
        int[] array = new int[len_array];
        for (int i = 0; i < array.length; i++) {
            array[i] = StdRandom.uniform(0, 6);
        }
        int[] res = histogram(array, 3);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(res));
        
    }

    
}