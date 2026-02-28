import java.util.Scanner;

public class PalindromeChecker {
    /*
     * @author developer
     * @version 3.0
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        //flag = s.equals(rev);


        System.out.print("Is it a Palindrome? : ");
        System.out.print(s.equals(rev));
    }

}

