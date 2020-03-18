import java.util.HashMap;
import java.util.Map;

/**
 * The goal of this exercise is to convert a string to a new string where each character
 * in the new string is "(" if that character appears only once in the original string, or ")" if that character appears
 * more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
 *
 * Examples
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))(("
 */

//public class DuplicateEncoder {
//    static String encode(String word) {
//        Map<Character, Integer> map = new HashMap<>();
//        word = word.toLowerCase();
//
//        for (int i = 0; i < word.length(); i++) {
//            if (map.containsKey(word.charAt(i))) {
//                int value = map.get(word.charAt(i));
//                map.remove(word.charAt(i));
//                map.put(word.charAt(i), ++value);
//            }
//            else {
//                map.put(word.charAt(i), 1);
//            }
//        }
//
//        String output = "";
//
//        for (int i = 0; i < word.length(); i++) {
//            output += (map.get(word.charAt(i)) > 1) ? ")" : "(";
//        }
//        return output;
//    }
//}

// NOT WORKING