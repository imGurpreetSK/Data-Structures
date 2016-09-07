package SearchingAndSorting;

/**
 * Created by Gurpreet on 07/09/16.
 */
public class Insertion {

    public static void main(String[] args) {

        int[] arr = {23, 45, 11, 22, 103, 453, 2, 0, 12};

        arr = sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    private static int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            //for every element from 0 -> i-1
            int j=i-1;
            int temp = arr[i];

            //move elements one ahead
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            //insert in array
            arr[j+1] = temp;

        }

        return arr;

    }

}
