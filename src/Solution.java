import java.lang.StringBuilder;

/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was capitalized
 * (known as Upper Camel Case, also often referred to as Pascal case).
 */

public class Solution {

    static String toCamelCase(String s){
        String[] words = s.split("[_\\-]");
        s=words[0];
        for(int i=1; i<words.length; i++)
            s+=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
        return s;
    }
}
