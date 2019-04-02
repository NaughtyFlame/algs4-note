import edu.princeton.cs.algs4.StdRandom;
/**
 * Ex_1_1_11
 */
public class Ex_1_1_11 {

    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        boolean[][] array = new boolean[row][col];

        // init the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (StdRandom.uniform(0.0, 1.0) > 0.5) {
                    array[i][j] = true;
                } else {
                    array[i][j] = false;
                }
            }
        }

        // print out the col num
        System.out.printf(" ");
        for (int j = 0; j < col; j++) {
            System.out.printf("%2d", j);
        }
        System.out.print("\n");
        // 
        for (int i = 0; i < row; i++) {
            System.out.printf("%d", i);
            for (int j = 0; j < col; j++) {
                if (array[i][j] == true) {
                    System.out.printf("%2s", "*");
                } else {
                    System.out.printf("%2s", " ");
                }
                
            }
            System.out.print("\n");
        } 
    }
}