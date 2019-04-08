import edu.princeton.cs.algs4.In;
import java.util.Arrays;
/**
 * Ex_1_1_28
 */
public class Ex_1_1_28 {

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        
        Arrays.sort(whitelist);

        int[] array_without_dup = duplicates(whitelist);

        // print the array without duplicates

        for (int i = 0; i < array_without_dup.length; i++) {
            System.out.println(array_without_dup[i]);
        }        

    }

    public static int[] duplicates(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        
        // tag indique the end of no duplicates array.
        int tag = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                array[tag+1] = array[i];
                tag += 1;
            }    
        }
        
        return Arrays.copyOfRange(array, 0, tag+1);
               
    }
}