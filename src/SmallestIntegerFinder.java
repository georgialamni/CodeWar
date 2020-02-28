/**
 * Given an array of integers your solution should find the smallest integer.
 */

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {

        quickSort(args, 0, args.length - 1);
        return args[0];
    }

    private static void quickSort(int[] values, int leftIndex, int rightIndex) {
        int index = partition(values, leftIndex, rightIndex);
        if (leftIndex < index - 1) quickSort(values, leftIndex, index - 1);
        if (index < rightIndex) quickSort(values, index, rightIndex);
    }

    private static int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        return i;
    }
}
