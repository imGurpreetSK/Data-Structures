package Arrays;

//O(n) solution
public class FindPairWithSumX {
    public static void main (String[] args) {
        int[] A = {1,3,9,8,7,6,4};
        int sum = 13;

        findValues(A, sum);

    }

    private static void findValues(int[] A, int sum){

        boolean[] B = new boolean[20];
        for (int aA : A) {
            int temp = sum - aA;
            if (temp >= 0 && B[temp])
                System.out.println(temp + " " + aA);
            B[aA] = true;
        }

    }

}
