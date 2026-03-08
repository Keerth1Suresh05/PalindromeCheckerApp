import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;


public class PalindromeChecker {
    /*
     * @author developer
     * @version 7.0
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();
        Deque<Character> deque = new ArrayDeque<>();

        char[] str = s.toCharArray();

        for(char c: str){
            deque.add(c);
        }

        while(deque.size()>1){
            if(deque.removeFirst()!=deque.removeLast()){
                flag = false;
                break;
            }
        }

        System.out.print("Is it a Palindrome? : ");
        System.out.println(flag);
    }
}

