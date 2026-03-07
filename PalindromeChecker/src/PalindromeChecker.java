import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    /*
     * @author developer
     * @version 5.0
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();
        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();

        for(char c: str){
            stack.push(c);
        }
        String str1="";
        while(!stack.empty()){
            str1+=stack.pop();
        }

        System.out.print("Is it a Palindrome? : ");
        System.out.println(s.equals(str1));
    }
}

