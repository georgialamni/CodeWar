import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 *
 * String will never be empty and you do not need to account for different data types.
 */

public class ShortestWord {

    public static int findShort(String s) {
        int l = Integer.MAX_VALUE;
        String[] words = s.split("\\s");
        for (int i = 0; i < words.length; i++) {
            l = Math.min(l, words[i].length());
        }
        return l;
    }
}
