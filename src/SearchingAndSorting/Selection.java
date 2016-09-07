package SearchingAndSorting;

/**
 * Created by Gurpreet on 07/09/16.
 */
public class Selection {

    public static void main(String[] args) {

        int[] arr = {23, 45, 11, 22, 103, 453, 2, 0, 12};

        arr = sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    private static int[] sort(int[] arr){

        //for entire loop
        for(int i=0; i<arr.length-1; i++){

            //find minimum element for that recursion
            int idx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[idx]>arr[j])     //increasing order sort
                    idx = j;
            }

            //swap the elements
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;

        }

        return arr;

    }

}
