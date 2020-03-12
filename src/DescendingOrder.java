import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.
 */

public class DescendingOrder {

    public static int sortDesc(final int num) {
        String[] tempArray = String.valueOf(num).split("");
        Arrays.sort(tempArray, Collections.reverseOrder());
        return Integer.valueOf(String.join("", tempArray));
    }
}
