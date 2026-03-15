import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    /*
     * @author developer
     * @version 12.0
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();
        StackStrategy obj = new StackStrategy();

        System.out.print("Is it a Palindrome? : ");
        System.out.println(obj.check(s));
        scn.close();
    }
}

interface PalindromeStrategy{}

class StackStrategy implements PalindromeStrategy{
    public boolean check(String s){
        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();
        String str1="";

        for(char c:str){
            stack.push(c);
        }
        for(char c:str){
            str1+=stack.pop();
        }

        if(s.equals(str1)){
            return true;
        }
        else {
            return false;}
    }
}


