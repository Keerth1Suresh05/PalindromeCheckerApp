import java.util.Scanner;

public class PalindromeChecker {
    /*
     * @author developer
     * @version 10.0
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();

        String normalized = normaliseString(s);

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                flag = false;
                break;
            }
        }

        System.out.print("Is it a Palindrome? : ");
        System.out.println(flag);
    }

    public static String normaliseString(String s) {
        String symbolnoSpace = s.replaceAll("[^a-zA-Z]", "");//replacing symbols n spaces with null
        String lowercase = symbolnoSpace.toLowerCase();//covert to lowercase
        return lowercase;//return string
    }

}


