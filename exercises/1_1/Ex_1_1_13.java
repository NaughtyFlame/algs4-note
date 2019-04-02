import edu.princeton.cs.algs4.StdRandom;
/**
 * Ex_1_1_13
 */
public class Ex_1_1_13 {

    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        int[][] array = new int[row][col];
        int value;
        // random generate array with given array size
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = StdRandom.uniform(0, 10);
                System.out.printf("%2d", array[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("transpositon...");

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.printf("%2d", array[i][j]);
            }
            System.out.print("\n");
        }

    }
}