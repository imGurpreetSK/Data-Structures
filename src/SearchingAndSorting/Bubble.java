package SearchingAndSorting;

/**
 * Created by Gurpreet on 01/09/16.
 */
public class Bubble {

    public static void main(String[] args) {

        int[] arr = {23, 45, 11, 22, 103, 453, 2, 0, 12};

        arr = sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    private static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
}
