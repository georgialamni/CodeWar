import java.util.Arrays;

/**
 *Beginner - Lost Without a Map
 * Given an array of integers, return a new array with each value doubled.
 */

public class Maps {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x*2).toArray();

//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = inputArray[i]*2;
//        }
//        return inputArray;
    }
}
