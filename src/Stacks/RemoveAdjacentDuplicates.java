package Stacks;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Gurpreet on 04/08/16.
 */
public class RemoveAdjacentDuplicates {

    private static Stack<Integer> stack;

    public static void main(String[] args) {

        stack = new Stack<>();
        int[] arr = new int[]{1, 5, 6, 8, 8, 8, 0, 1, 1, 0, 6, 5};

//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(5);
//        arr.add(6);
//        arr.add(8);
//        arr.add(8);
//        arr.add(8);
//        arr.add(0);
//        arr.add(1);
//        arr.add(1);
//        arr.add(0);
//        arr.add(6);
//        arr.add(5);

        removeAdjacentDup(arr);

    }

    private static void removeAdjacentDup(int[] arr) {

//        stack.push(-1);

        for (int i=0; i<arr.length; i++) {

            if (stack.empty()) stack.push(arr[i]);
            else if (stack.peek() != arr[i]) stack.push(arr[i]);
            else if (stack.peek() == arr[i]) {
                while (stack.peek() == arr[i]) i++;
                stack.pop();
//                i--;
            }
        }
        while (!stack.empty())
            System.out.print(stack.pop() + " ");

    }

}
