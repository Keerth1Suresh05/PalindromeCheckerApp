import java.util.Scanner;

public class PalindromeChecker {
    /*
     * @author developer
     * @version 11.0
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();
        PalindromeService obj = new PalindromeService();

        System.out.print("Is it a Palindrome? : ");
        System.out.println(obj.checkPalindrome(s));
    }
}

class PalindromeService {
    public boolean checkPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] str = s.toCharArray();

        while (start < end) {
            if (str[start] != str[end]) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}

