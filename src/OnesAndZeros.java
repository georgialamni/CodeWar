import java.util.List;

/**
 * Given an array of ones and zeroes, convert the equivalent binary value to an integer.
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 * Examples:
 * Testing: [0, 0, 0, 1] ==> 1
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 0, 1] ==> 5
 * Testing: [1, 0, 0, 1] ==> 9
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 1, 0] ==> 6
 * Testing: [1, 1, 1, 1] ==> 15
 * Testing: [1, 0, 1, 1] ==> 11
 */

public class OnesAndZeros {

    public static int convertBinaryArrayToInt(List<Integer> binary) {

        int total = 0;
        int currentValue = 1;
        for (int index = binary.size() - 1; index >= 0; index--) {
            if (binary.get(index) == 1) {
                total += currentValue;
            }
            currentValue *= 2;
        }
        return total;

        //return binary.get(0) * 8 + binary.get(1) *4 + binary.get(2) * 2 + binary.get(3) * 1;
    }
}
