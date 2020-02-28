import java.util.Arrays;

public class MinMax {
    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};

//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for(int i : arr) {
//            if(i < min) min = i;
//            if(i > max) max = i;
//        }
//        return new int[] {min, max};
    }
}
