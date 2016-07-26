package Stacks;

import java.util.Stack;

/**
 * Created by Gurpreet on 26/07/16.
 */
public class FindMinimumInO1 {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    static int input[] = {5, 2, 4, 1, 7, 0};

    public static void main(String[] args) {

        for (int i : input) {
            stack.push(i);
            if (minStack.empty()) minStack.push(i);
//            if(minStack.peek()>i || minStack.empty()){
            else
                minStack.push(Math.min(minStack.peek(), i));
//            }
        }

        System.out.println(minStack.peek());
//        System.out.println(minStack.size());
//        System.out.println(stack.size());

    }

}
