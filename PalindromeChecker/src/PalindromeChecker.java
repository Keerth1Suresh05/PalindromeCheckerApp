import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
//import java.util.PriorityQueue;
//can't use priority queue as it'll return alphabet priority

public class PalindromeChecker {
    /*
     * @author developer
     * @version 6.0
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        char[] str = s.toCharArray();

        for(char c: str){
            stack.push(c);
            queue.offer(c);
        }

        while(!queue.isEmpty()){
            if(queue.poll()!=stack.pop()){
                flag = false;
                break;
            }
        }

        System.out.print("Is it a Palindrome? : ");
        System.out.println(flag);
    }
}

