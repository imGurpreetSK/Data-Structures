package Stacks;

import java.util.Stack;

/**
 * Created by Gurpreet on 27/07/16.
 */
public class ReverseStack {

    private static void reverse(Stack<Integer> stack){      //pops the elements and inserts them at the bottom
        if(stack.empty())   return;
        int temp = stack.pop();
        reverse(stack);
        insertAtBottom(stack, temp);
 }

    private static void insertAtBottom(Stack<Integer> stack, int data){     //inserts elements at bottom: empties stack for every insertion
        if(stack.empty()){
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, data);
        stack.push(temp);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

/*
        stack.forEach(System.out::print);
        System.out.println();

        Collections.reverse(stack);

        stack.forEach(System.out::print);
*/

        stack.forEach(System.out::print);   System.out.println();

        reverse(stack);

        stack.forEach(System.out::print);

    }

}
