/**
 * This time no story, no theory. The examples below show you how to write function accum:
 *
 * Examples:
 *
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 */

public class Accumul {

    public static String accum(String s) {

        char[] stringChar = s.toCharArray();
        StringBuilder mumbling = new StringBuilder();
        int counter = 1;

        for (char letter : stringChar) {
            for (int i = 0; i < counter; i++) {
                if (i == 0) {
                    mumbling.append(Character.toUpperCase(letter));
                }
                else {
                    mumbling.append(Character.toLowerCase(letter));
                }
            }
            mumbling.append('-');
            counter++;
        }
        return mumbling.toString().substring(0, mumbling.length() - 1);
    }
}
