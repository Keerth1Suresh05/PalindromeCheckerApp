import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    /*
     * @author developer
     * @version 13.0
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();
        StackStrategy obj = new StackStrategy();

        System.out.print("Is it a Palindrome? : ");
        long starttime1 = System.nanoTime();
        obj.check(s);
        long stoptime1 = System.nanoTime();
        System.out.print("\n UC12 StackStrategy: "+(stoptime1-starttime1));
        System.out.println("\n"+obj.check(s));

        long starttime4 = System.nanoTime();
        characterArr(s);
        long stoptime4 = System.nanoTime();
        System.out.print("\n UC4 CharacterArray: "+(stoptime4-starttime4));
        System.out.println("\n"+characterArr(s));

        long starttime2 = System.nanoTime();
        reverse(s);
        long stoptime2 = System.nanoTime();
        System.out.print("\n UC3 String reverse: "+(stoptime2-starttime2));
        System.out.println("\n"+reverse(s));

        long starttime3 = System.nanoTime();
        hardcode(s);
        long stoptime3 = System.nanoTime();
        System.out.print("\n UC2 Hard code: "+(stoptime3-starttime3));
        System.out.println("\n"+hardcode(s));

        scn.close();
    }

    public static boolean hardcode(String s){
        boolean flag = true;
        int n = s.length();
        for(int i=0; i<=n/2 ;i++){
            /*
              checks 0 and (n-1)th char (since indexed 0)
              so on... until middle of string
             */
            if(s.charAt(i)!=s.charAt(n-1-i)){
                //if condition false flag down
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static boolean reverse(String s){
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }

    public static boolean characterArr(String s){
        boolean flag = true;
        char[] str = s.toCharArray();
        int n = s.length();
        int left = 0;
        int right = n-1;

        while(left<right){
            for(int i=0;i<=n;i++){
                if(str[left]!=str[right]) {
                    flag = false;
                    break;
                }
            }
            left++;
            right--;
        }
        return flag;
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

        if(!stack.empty()) {
            return s.equals(str1);
        }
        return true;
    }
}



