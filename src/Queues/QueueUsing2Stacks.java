package Queues;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Gurpreet on 09/08/16.
 */
public class QueueUsing2Stacks {

    private static Stack<Integer> s1 = new Stack<>();
    private static Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args) {
        for(int i=0; i<10; i++)
            s1.push(i);

        System.out.print("Enter Choice:\n1.Insert\n2.Delete\n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                int data = sc.nextInt();
                s1.push(data);
                break;
            case 2:
                if(s1.empty()&&s2.empty())
                    System.out.println("ERROR!");
                else if (s1.empty() && !s2.empty())
                    System.out.println(s2.pop());
                else if(!s1.empty()){
                    while (!s1.empty())
                        s2.push(s1.pop());
                }
                break;
            default:
        }
        while (!s1.empty())
            System.out.print(s1.pop()+" ");
        System.out.println( );
        while (!s2.empty())
            System.out.print(s2.pop()+" ");
        System.out.println( );

    }

}
