import java.util.Arrays;

/**
 * Ex_1_1_22
 */
public class Ex_1_1_22 {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        char[] spaces_char = new char[depth];
        Arrays.fill(spaces_char, ' ');
        String spaces = new String(spaces_char);
        if (key < a[mid]) {
            System.out.print(spaces);
            System.out.printf("lo: %6d - hi: %6d\n", lo, hi);
            return rank(key, a, lo, mid - 1, depth + 1);
        } else if (key > a[mid]) {
            System.out.print(spaces);
            System.out.printf("lo: %6d - hi: %6d\n", lo, hi);
            return rank(key, a, mid + 1, hi, depth + 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(rank(4, array));
    }
}