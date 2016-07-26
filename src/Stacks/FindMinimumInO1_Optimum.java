package Stacks;

import java.util.Stack;

/**
 * Created by Gurpreet on 26/07/16.
 */
public class FindMinimumInO1_Optimum {

    //Run the normal solution too to see the difference n space complexity

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    static int[] input = {3, 5, 0, 1, 7, 3, 6};

    public static void main(String[] args) {

        for (int i : input){
            stack.push(i);
            if(minStack.empty())    minStack.push(i);
            else if(minStack.peek() > i)   minStack.push(i);
        }

        System.out.println(minStack.peek());
        System.out.println(minStack.size());
        System.out.println(stack.size());

    }

}
