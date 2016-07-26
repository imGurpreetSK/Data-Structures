package Stacks;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Gurpreet on 21/07/16.
 */
public class CheckBalanced {

    static Stack<Character> stack = new Stack<>();
    static String input = "{[<(a)>]}";

    public static void main(String[] args) {

        for (int i = 0; i < input.length(); i++) {
            if(stack.empty() && (input.charAt(i) == '}' || input.charAt(i) == '>' || input.charAt(i) == ']' || input.charAt(i) == ')')) {
                System.out.print("Unbalanced");
                System.exit(0);
            }else if (input.charAt(i) == '{' || input.charAt(i) == '<' || input.charAt(i) == '[' || input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            } else if (!stack.empty() && ((input.charAt(i) == '}' && stack.peek() == '{') || (input.charAt(i) == '>' && stack.peek() == '<') || (input.charAt(i) == ')' && stack.peek() == '(') || (input.charAt(i) == ']' && stack.peek() == '['))) {
//                System.out.println("Balanced");
                stack.pop();
            }
        }
        if(!stack.empty()){
            System.out.println("Unbalanced");
        }else{
            System.out.println("Balanced");
        }
    }

}
