/**
 * Ex_1_1_19
 */
public class Ex_1_1_19 {

    private static long[] array = new long[100];

    public static long F(int N) {
        if (N == 0) {
            array[0] = 0;
        } else if (N == 1) {
            array[1] = 1;
        } else {
            array[N] = array[N-1] + array[N-2]; 
        }

        return array[N];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + F(N));
        }
    }
}