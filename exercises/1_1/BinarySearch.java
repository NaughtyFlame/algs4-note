import edu.princeton.cs.algs4.In;
import java.util.Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        if (key > a[hi]) return hi + 1;
        while (lo <= hi) {
            int mid = lo + (hi-lo) / 2;
            if (a[mid] < key && a[mid+1] == key) {
                return mid + 1;
            } else if (a[mid] >= key) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return 0;
    }

    public static int count(int key, int[] a) {
        int i = rank(key, a);
        int count_equal = 0;
        while (i < a.length && a[i] == key) {
            count_equal += 1;
            i += 1;
        }

        return count_equal;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();

        Arrays.sort(whitelist);
        int key = Integer.parseInt(args[1]);

        System.out.println(rank(key, whitelist));
        System.out.println(count(key, whitelist));
        
    }
}