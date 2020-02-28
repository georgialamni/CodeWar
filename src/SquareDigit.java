import org.junit.Test;
// Problem: Square Every Digit (http://www.codewars.com/kata/square-every-digit/java)

public class SquareDigit {

    public int squareDigits(int n) {
        String s = n + "";
        String[] digits = s.split("");
        String output = "";

        for (String str : digits) {
            int i = Integer.parseInt(str);
            output +=  i * i;
        }

        return Integer.parseInt(output);
    }

//    @Test
//    public void test() {
//        assertEquals(811181, new SquareDigit().squareDigits(9119));
//    }
}
