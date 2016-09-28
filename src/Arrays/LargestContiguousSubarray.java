package Arrays;

/**
 * Created by Gurpreet on 26/09/16.
 */
public class LargestContiguousSubarray {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        findMaxSubarray(arr);

    }

    private static void findMaxSubarray(int[] arr) {

        int max_so_far = arr[0];
        int max_ending_here = arr[0];       //current max value
        for (int i = 1; i < arr.length; i++) {
            max_ending_here = Math.max(arr[i], max_ending_here+arr[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        System.out.print(max_so_far);
    }

    //for(i->n)
    //  if(sum+a[i]>0)
    //      sum+=a[i];
    //  else
    //      sum=0;
    //  ans = max(sum, ans);

}
