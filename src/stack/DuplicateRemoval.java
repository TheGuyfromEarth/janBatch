package stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateRemoval {
    public static void main(String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        String str = input.next();

        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        stack.push(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            char peek = stack.peek();

            if (peek != ch) {
                sb.append(ch);
                stack.push(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
