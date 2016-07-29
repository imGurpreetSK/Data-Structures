package Stacks;

import java.util.Stack;

/**
 * Created by Gurpreet on 29/07/16.
 */

//Sorting in ascending order

public class SortStack {

    private static void Sort(Stack<Integer> stack) {

        Stack<Integer> sortedStack = new Stack<>();
        while (!stack.empty()) {
            int temp = stack.pop();
            while (!sortedStack.empty() && sortedStack.peek() > temp)
                stack.push(sortedStack.pop());                  //if top of sorted stack is greater than top of input stack, pop and push the top back to original stack
            sortedStack.push(temp);
        }
        for (int i : sortedStack)
            System.out.print(i + " ");
//        return sortedStack;
    }


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(8);
        stack.push(53);
        stack.push(4);
        stack.push(1);

        for (int i : stack)
            System.out.print(i + " ");
        System.out.println();

        Sort(stack);

    }

}
